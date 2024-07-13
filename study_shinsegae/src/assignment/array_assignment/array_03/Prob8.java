package assignment.array_assignment.array_03;

public class Prob8 {

  public static void main(String[] args) {
    int[][] array = new int[5][5];
    int count=1;
    for (int i = 0; i < array.length; i++) {
      for (int j = array[i].length-1; j >= 0; j--) {
        array[i][j] = count++;
      }

    }
    for (int[] ints : array) {
      for (int anInt : ints) {
        System.out.print(anInt+" ");
      }
      System.out.println();
    }
  }

}
