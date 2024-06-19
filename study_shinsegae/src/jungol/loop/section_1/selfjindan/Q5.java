package jungol.loop.section_1.selfjindan;

import java.io.*;
import java.util.*;

public class Q5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a % 3 ==0){
                System.out.println(a/3);
            }
            if(a == -1) break;
        }



    }
}