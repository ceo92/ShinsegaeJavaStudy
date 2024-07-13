package jungol.loop.section_3.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=0 , count=0;
        for(int i=1 ; ;i+=2){
            sum += i;
            count++;
            if(a <= sum){
                System.out.print(count+" "+sum);
                break;
            }
        }




    }
}