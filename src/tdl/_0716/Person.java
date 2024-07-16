package tdl._0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import tdl._0716.CalEx02.Calculable;

public class Person {

  public static int action(Calculable cal) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("두 정수 입력");
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int result = cal.calculate(x, y);
    return result;
  }

  @FunctionalInterface
  interface Calculable{
    int calculate(int x,  int y);
  }

}
