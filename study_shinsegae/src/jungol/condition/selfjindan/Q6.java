package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        if(a.equals("M") && b >= 18){
            System.out.println("MAN");
        }

        else if(a.equals("M") && b < 18){
            System.out.println("BOY");
        }

        else if(a.equals("F") && b >= 18){
            System.out.println("WOMAN");
        }

        else if(a.equals("F") && b < 18){
            System.out.println("GIRL");
        }










    }
}
