package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        if(a >= 4.0 && b >= 4.0) System.out.println("A");
        else if(a >= 3.0 && b >= 3.0) System.out.println("B");
        else System.out.println("C");






    }
}
