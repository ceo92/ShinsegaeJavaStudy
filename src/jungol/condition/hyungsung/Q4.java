package jungol.condition.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        System.out.print("Number? ");
        int num = Integer.parseInt(br.readLine());

        switch(num){
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;

            case 3:
                System.out.println("chick");
                break;

            default:
                System.out.println("I don't know.");
                break;
        }


    }
}