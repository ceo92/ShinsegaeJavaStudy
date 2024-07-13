package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q8{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        if(a >= 4.0){
            System.out.println("scholarship");
        }
        else if(a>=3.0){
            System.out.println("next semester");
        }
        else if(a>=2.0){
            System.out.println("seasonal semester");
        }
        else{
            System.out.println("retake");
        }










    }
}