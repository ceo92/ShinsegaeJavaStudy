package tdl._0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalEx01 {

  public static void main(String[] args) throws IOException {
    System.out.println("두 정수 입력");
    int x = buffReader(br -> br.readLine());
    int y = buffReader(br -> br.readLine());

    action(((a,b)->a*b) , x,y);
    action(((a,b)->a+b) , x,y);
  }

  public static void action(Calculable cal , int x , int y){
    System.out.println(cal.calculate(x,y));
  }

  public static int buffReader(BufferedReaderProcessor buffProcessor) throws IOException {
    String input = buffProcessor.buff(new BufferedReader(new InputStreamReader(System.in)));
    int parseIntInput = Integer.parseInt(input);
    return parseIntInput;
  }



  @FunctionalInterface
  interface Calculable{
    int calculate(int x,  int y);
  }

  @FunctionalInterface
  interface BufferedReaderProcessor{
    String buff(BufferedReader br) throws IOException;
  }


}
