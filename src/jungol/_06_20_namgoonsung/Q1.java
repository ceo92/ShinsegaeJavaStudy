package jungol._06_20_namgoonsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

  public static void main(String[] args) throws IOException {
    int x=0;
    //1
    System.out.println(x>10 && x<20);

    //2
    char ch = 0;
    System.out.println((ch != ' ') || (ch != '\t'));

    //3
    System.out.println((ch == 'x') || (ch == 'X'));

    //4
    System.out.println(ch>='0' && ch<='9');

    //5
    System.out.println(ch>=65 && ch<=122);

    int year=0;
    //6
    System.out.println(year %400==0 ||(year % 4==0 && year % 100 != 0));

    //7
    boolean powerOn=false;
    System.out.println(!powerOn);

    //8
    String str = "yes";
    System.out.println(str.equals("yes"));

  }

}
