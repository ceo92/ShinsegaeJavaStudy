package jungol.loop.section_1.selfjindan;

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1 ; i<=a ; i++){
            sum+=i;
        }
        System.out.println(sum);



    }
}