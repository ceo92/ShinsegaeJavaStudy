package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2445 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for(int i=0 ; i<x ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }

            for(int j=x-1 ; j>i ; j--){
                System.out.print("  ");
            }
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        for(int i=0 ; i<x-1 ; i++){
            for(int j=x-1-i ; j>0 ; j--){
                System.out.print("*");
            }

            for(int j=0 ; j<i+1 ; j++){
                System.out.print("  ");
            }
            for(int j=x-1-i ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}




