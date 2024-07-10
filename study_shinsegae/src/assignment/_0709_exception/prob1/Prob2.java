package _0709_exception.prob1;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2 {

  public static void main(String[] args) {
    String inputStr;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("문자열을 입력하세요. : ");
    inputStr = keyboard.nextLine();
    char[] inputCharArray = inputStr.toCharArray();

    //프로그램을 구현하세요.
    for (int i=inputStr.length()-1 ; i>=0 ; i--){
      System.out.print(inputCharArray[i]);
    }

  }

}