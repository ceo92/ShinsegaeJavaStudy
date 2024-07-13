package assignment._0709_exception.prob3;

import java.net.Proxy.Type;

public class FindNumbers {

  public static void main(String[] args) {
    FindNumbers fn=new FindNumbers();
    //아 static 안 쓰려면 셀프  참조하는 객체를 생성해주면 되는구나 ㅇㅇ

    long number = 228754462;
    System.out.println( "입력 숫자 = " + number );
    System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
    System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
  }

  /*  이곳에 countNumber 메소드를 작성하십시오. */
  int countNumber(long number, int i){
    String str = String.valueOf(number);
    char[] charArray = str.toCharArray();
    int result = 0;
    for (int x=0 ; x<charArray.length ; x++){
      if (charArray[x]-48 == i){
        result++;
      }
    }
    return result;
  }

}