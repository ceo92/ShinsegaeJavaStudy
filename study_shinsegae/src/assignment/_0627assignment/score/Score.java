package _0627assignment.score;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] students = new int[0];
    while (true){
      System.out.println("-------------------------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("-------------------------------");
      System.out.print("선택>");
      int num = in.nextInt();
      switch (num){
        case 1:
          System.out.print("학생수> ");
          int studentNum = in.nextInt();
          students = new int[studentNum];
          continue;
        case 2:
          for (int i=0 ; i<students.length ; i++){
            System.out.printf("scores[%d]>",i);
            students[i] = in.nextInt();
          }
          continue;
        case 3:
          for (int i = 0; i < students.length; i++) {
            System.out.printf("scores[%d] : ",i);
            System.out.println(students[i]);
          }
          continue;
        case 4:
          System.out.println("최고 점수 : "+ Arrays.stream(students).max().orElseThrow());
          System.out.printf("평균 점수 : %.1f \n",Arrays.stream(students).average().orElseThrow());
          continue;
        case 5:
          System.out.println("프로그램 종료");
          return;

      }

    }
  }

}
