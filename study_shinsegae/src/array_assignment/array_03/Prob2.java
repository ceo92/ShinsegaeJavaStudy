package array_assignment.array_03;

public class Prob2 {

  public static void main(String[] args) {

    int[] array = new int[10];
    //문제2
    generateRandom(array);
    getMaxNum(array);



  }

  private static void getMaxNum(int[] array) {
    int temp = 0;
    for (int i : array) {
      if (i >= temp) {
        temp = i;
      }
    }
    System.out.println("배열에서 가장 큰 숫자 : " + temp);
  }

  private static void generateRandom(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (1 + Math.random() * 30);
    }
    for (int i : array) {
      System.out.print(i+", ");
    }
    System.out.println();

  }

}
