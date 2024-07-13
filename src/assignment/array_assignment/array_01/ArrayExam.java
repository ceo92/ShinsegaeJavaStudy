package assignment.array_assignment.array_01;

public class ArrayExam {

  public static void main(String[] args) {
    //문제 2.
    int[] array = new int[5];
    for (int i=0 ; i<array.length;i++) {
      int v = (int) (1 + Math.random() * 100);
      array[i] = v;
    }
    for (int i : array) {
      System.out.print(i+" ");
    }
  }
}
