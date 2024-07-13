package jungol.loop.section_3.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int i=1;
        int result=a;
        while(result<100){
            //7*1 7*2 7*3 , ... 7*10
            System.out.print(result+" ");
            if(result%10 ==0) {
                break;
            }
            result = a*(++i);



        }
        br.close();


    }
}