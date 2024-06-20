package jungol._06_20_namgoonsung;

import java.util.Scanner;

public class Q10 {

  public static void main(String[] args) {
    int answer = 1 + (int) (Math.random() * 100);
    int input = 0;
    int count = 0;

    Scanner in = new Scanner(System.in);
    do {
      count++;
      System.out.print("1과 100 사이의 값을 입력하세요 : ");
      input = in.nextInt();

      if (answer > input) {
        System.out.println("더 큰 수를 입력하세요.");
      }
      else if (answer < input){
        System.out.println("더 작은 수를 입력하세요.");
      }
      else{
        System.out.println("맞혔습니다.");
        break;
      }

    }while (true);
    System.out.println("시도횟수는 " + count+"번입니다.");
  }

}
