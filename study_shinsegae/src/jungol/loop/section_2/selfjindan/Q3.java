package jungol.loop.section_2.selfjindan;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=1 ; i<=a ; i++){
            if(i % 2 ==0){
                System.out.print((i)+" ");
            }
        }



    }
}