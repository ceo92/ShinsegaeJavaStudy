package jungol.june_19_assignment;

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" ");

        int n = Integer.parseInt(x[0]); // 높이
        int m = Integer.parseInt(x[1]); // 종류
        switch(m){
            case 1:
                for(int i=0 ; i<n ; i++){
                    for(int j=0 ; j<i+1 ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;


            case 2:
                for(int i=0 ; i<n ; i++){
                    for(int j=n ; j>i ; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for(int i=0 ; i< n  ; i++){
                    for(int j=n ; j>i ; j--){
                        System.out.print(" ");
                    }
                    for(int j=0 ; j<2*i+1 ; j++){
                        System.out.print("*");
                    }
                    for(int j=n ; j>i ; j--){
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

        }

    }
}