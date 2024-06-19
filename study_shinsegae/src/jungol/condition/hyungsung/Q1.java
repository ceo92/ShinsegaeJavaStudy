package jungol.condition.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>=b){
            System.out.println(a-b);
        }
        else{
            System.out.println(b-a);
        }




    }
}
