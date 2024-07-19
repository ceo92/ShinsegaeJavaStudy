package assignment.board_project.tx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class PropertiesExample {

  public static void main(String[] args) {

    Properties properties = new Properties();


    // application.properties 파일 경로를 지정합니다.
    String propertiesFilePath = "src/application.properties";

    try (InputStream input = new FileInputStream(propertiesFilePath)) {
      // properties 파일을 로드합니다.
      properties.load(input);

      // properties 값을 가져옵니다.
      String dbUrl = properties.getProperty("database.url");
      String dbUsername = properties.getProperty("database.username");
      String dbPassword = properties.getProperty("database.password");

      // 가져온 값들을 출력합니다.
      System.out.println("Database URL: " + dbUrl);
      System.out.println("Database Username: " + dbUsername);
      System.out.println("Database Password: " + dbPassword);

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
