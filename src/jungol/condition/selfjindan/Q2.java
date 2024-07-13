package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int isObesity = b+100 - a;
        System.out.println(isObesity);
        if(isObesity > 0)System.out.print("Obesity");




    }
}