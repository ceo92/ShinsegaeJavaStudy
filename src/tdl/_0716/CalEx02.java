package tdl._0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalEx02 {

  public static void main(String[] args) throws IOException {
    action((a,b) ->
        System.out.println(a+b)
    );
    action((a,b) ->
        System.out.println(a*b)
    );
  }

  public static void action(Calculable cal) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("두 정수 입력");
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    cal.calculate(x, y);
  }



  @FunctionalInterface
  interface Calculable{
    void calculate(int x,  int y);
  }


}
