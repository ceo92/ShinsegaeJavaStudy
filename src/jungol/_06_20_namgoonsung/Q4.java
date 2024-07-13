package jungol._06_20_namgoonsung;

public class Q4 {

  public static void main(String[] args) {
    int sum=0;
    int i=1;
    while(true){
      if (sum>= 100){
        break;
      }
      if (i % 2 ==0){
        sum -= i;
      }
      else{
        sum += i;
      }

      i++;
    }
    System.out.println(i+"까지 더해야 100 이상");
  }

}
