package jungol.loop.section_2.selfjindan;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=a; i<=100 ; i++){
            sum+=i;
        }
        System.out.println(sum);



    }
}