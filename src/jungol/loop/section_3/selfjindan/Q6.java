package jungol.loop.section_3.selfjindan;

import java.io.*;
import java.util.*;

public class Q6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char x = 'A';
        for(int i=0 ; i<a ; i++){
            for(int j=a ; j>i ; j--){
                System.out.print(x++);
            }

            System.out.println();


        }







    }
}