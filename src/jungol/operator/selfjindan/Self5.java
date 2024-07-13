package jungol.operator.selfjindan;

import java.io.*;

public class Self5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);


        System.out.println((a==b)? 1:0);
        System.out.println((a!=b)? 1:0);



    }

}