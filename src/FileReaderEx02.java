import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderEx02 {

  public static void main(String[] args) throws IOException {
    Path path = Path.of("/Users/lee/Desktop/Temp/data.txt");

    Stream<String> stream;
    stream = Files.lines(path , Charset.defaultCharset());
    stream.forEach(System.out::println);

    File file = path.toFile(); //경로에서 파일 ㅐㄱㄱ체 생성
    FileReader fr = new FileReader(file); //파일 객체에서 파일 리더 생성
    BufferedReader br = new BufferedReader(fr); //파일 리더로 읽어옴 모든내용 ㅇㅇ
    stream = br.lines();
    stream.forEach(System.out::println);

    stream.close();

  }
}
