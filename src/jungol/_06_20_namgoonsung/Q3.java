package jungol._06_20_namgoonsung;

public class Q3 {

  public static void main(String[] args) {
    int accumulateSum=0;
    for (int i=1 ; i<=10 ; i++){
      for (int j=1 ; j<=i ; j++) {
        accumulateSum += j;
      }
    }
    System.out.println("누적합 = " + accumulateSum);
  }

}
