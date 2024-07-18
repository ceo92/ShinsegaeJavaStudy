import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterEx01 {

  public static void main(String[] args) {
    try {
      FileOutputStream fs = new FileOutputStream("/Users/lee/Desktop/Temp/data.txt");
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs)); //fs에다 쓰게싿 요런 의미 그래서 System.out이면 해당 라이브러리에 쓰겠다 이거임
      bw.write("Hello java.io.Writer!!");
      bw.newLine();
      bw.write("방가붑뜨");

      bw.close();
      fs.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
