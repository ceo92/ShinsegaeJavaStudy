import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args) throws IOException { //스트림 쓰면 무조건 IOException 처리
    try {
      InputStream inputStream1 = new FileInputStream("/Users/lee/Desktop/Temp/test.txt");
      InputStream inputStream2 = new FileInputStream("/Users/lee/Desktop/Temp/test2.txt");

      byte[] dataBytes = new byte[1024]; //배열 받을 준비


      while (true){

        int data = inputStream1.read();
        if (data == -1)break; //-1 : EOF , 더 이상 읽을 값 없을 때 -1 하고 끝 !

        for (int i = 0; i < dataBytes.length; i++) {
          dataBytes[i] = (byte)data;
          System.out.println(dataBytes[i]);
        }
      }

      inputStream1.close(); //flush 할 ㅔㄱ없음 읽는거니 그냥 종룔 ㅇㅇㅇ
      inputStream2.close(); //flush 할 ㅔㄱ없음 읽는거니 그냥 종룔 ㅇㅇㅇ

    } catch (FileNotFoundException e) {
      System.out.println("해당 경로에 파일이 존재하지 않습니다.");
    } catch (IOException e){
      e.printStackTrace();
    }
    //try- catch command - n 으로 가능


  }

}
