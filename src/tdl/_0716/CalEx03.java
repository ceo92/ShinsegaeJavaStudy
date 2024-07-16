package tdl._0716;

import java.io.IOException;

public class CalEx03 {
  public static void main(String[] args) throws IOException {
    Person person = new Person();
    int plusResult = person.action((a, b) -> a + b);
    System.out.println("plusResult = " + plusResult);
    int timeResult = person.action((a, b) -> a * b);
    System.out.println("timeResult = " + timeResult);

  }
}

