package json.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * 구현부
 */
public class Main {

  public static void main(String[] args) throws IOException {
    OutputStream os = new FileOutputStream("/Users/lee/Desktop/Temp/abc.txt");
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)); //fs에다 쓰게싿 요런 의미 그래서 System.out이면 해당 라이브러리에 쓰겠다 이거임
    List<String> hobbies = new ArrayList<>();
    hobbies.add("운동");
    hobbies.add("산책");
    hobbies.add("영화");

    User user = new User("이경민", 26, false, hobbies, new Address("24번길 12", "광운대로 1384", "12345"));
    bw.write("{user : "+user+"}");
    bw.flush();
    bw.close();

    InputStream is = new FileInputStream("/Users/lee/Desktop/Temp/abc.txt"); //스트림을 열고 읽는 객체를 생성
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    String ss = br.readLine();
    System.out.println(ss);

  }


}
