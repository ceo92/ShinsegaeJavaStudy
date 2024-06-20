package jungol._06_20_namgoonsung;

public class Q9 {

  public static void main(String[] args) {
    int num = 12345;
    int sum=0;
    int divideNum=10;
    while(num>0) {
      sum += num % divideNum;
      num /= divideNum;
    }
    System.out.println("sum = " + sum);



  }

}
