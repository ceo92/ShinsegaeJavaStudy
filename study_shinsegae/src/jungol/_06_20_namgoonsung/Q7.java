package jungol._06_20_namgoonsung;

public class Q7 {

  public static void main(String[] args) {
    String str = "12345";
    int sum=0;
    for (int i=0 ; i<str.length() ; i++){
        sum+= str.charAt(i)-48;
    }
    System.out.println("sum = " + sum);

  }

}
