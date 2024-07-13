package jungol.condition.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());

        if(a==0){
            System.out.println("zero");
        }
        else if(a > 0){
            System.out.println("plus");
        }
        else{
            System.out.println("minus");
        }




    }
}
