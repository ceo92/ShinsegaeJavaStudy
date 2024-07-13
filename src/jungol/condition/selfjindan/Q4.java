package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());


        if(a>=88.45){
            System.out.println("Heavyweight");
        }
        else if(a > 72.57 ){
            System.out.println("Cruiserweight");
        }
        else if(a > 61.23 ){
            System.out.println("Middleweight");
        }
        else if(a > 50.8 ){
            System.out.println("Lightweight");
        }
        else{
            System.out.println("Flyweight");
        }




    }
}