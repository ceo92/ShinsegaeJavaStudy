import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx01 {

  public static void main(String[] args) throws IOException {
    try {
      FileInputStream fs = new FileInputStream("/Users/lee/Desktop/Temp/data.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fs));
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
      fs.close();
    }catch (IOException e){
      throw new RuntimeException(e);
    }

  }
}
