package jungol.june_19_assignment;

import java.io.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0 ; i<a ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }

            for(int j=a*2-i-1 ; j>i ; j--){ //3 2 1
                System.out.print("*");
            }

            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}