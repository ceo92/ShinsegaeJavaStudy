package jungol.loop.section_3.hyungsung;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0 ; i<a ; i++){
            for(int j=0;j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=a ; i>1 ; i--){
            for(int j=i;j>1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}