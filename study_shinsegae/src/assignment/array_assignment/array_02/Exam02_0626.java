package assignment.array_assignment.array_02;

public class Exam02_0626 {

  public static void main(String[] args) {


    char[][] alphabet = new char[5][5];
    char start='A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start++;
      }
    }


    //2.원본 배열 출력
    System.out.println("\t\t\t원본 배열");
    System.out.println("==========================");
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        System.out.print(alphabet[i][j]+"\t\t\t");
      }
      System.out.println();
    }


    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        if (i == j) {
          alphabet[i][j] = '*';
        }
      }
    }

    System.out.println();
    System.out.println();

    //4. 수정된 배열 출력
    System.out.println("\t\t\t수정된 배열");
    System.out.println("==========================");
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        System.out.print(alphabet[i][j]+"\t\t\t");
      }
      System.out.println();
    }

  }

}
