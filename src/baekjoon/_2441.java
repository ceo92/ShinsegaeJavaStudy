package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2441 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for(int i=0 ; i<x ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }

            for(int j=x ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




