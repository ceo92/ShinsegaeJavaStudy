package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2440 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for(int i=0 ; i<x ; i++){
            for(int j=x ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




