package jungol.operator.selfjindan;

import java.io.*;

public class Self6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);


        System.out.printf("%d > %d --- %b\n" , a,b,a>b);
        System.out.printf("%d < %d --- %b\n" , a,b,a<b);
        System.out.printf("%d >= %d --- %b\n",a,b,a>=b);
        System.out.printf("%d <= %d --- %b\n",a,b,a<=b);




    }

}