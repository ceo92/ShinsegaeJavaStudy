import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImageEx {

  public static void main(String[] args) throws IOException {
    String originalFileName = "/Users/lee/Desktop/Temp/gorilla.jpeg";
    String targetFileName = "/Users/lee/Desktop/Temp/gorilla_copy2.jpeg";

    InputStream inputStream = new FileInputStream(originalFileName);
    OutputStream outputStream = new FileOutputStream(targetFileName);

    byte[] buff = new byte[1024];
    while (true){
      int data = inputStream.read(buff); //buff에다 읽어올라고 이런 식으로 ㅇㅇ
      if (data==-1) break;
      outputStream.write(buff , 0 , data);
    }


    //inputStream.transferTo(outputStream);//입력 스트림 => 출력 스트림으로 byte를 복사하는 메서드
    outputStream.flush();
    outputStream.close();
    inputStream.close();
  }

}
