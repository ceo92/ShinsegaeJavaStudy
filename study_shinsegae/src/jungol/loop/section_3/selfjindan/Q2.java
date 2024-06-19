package jungol.loop.section_3.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0 ; i<a ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}