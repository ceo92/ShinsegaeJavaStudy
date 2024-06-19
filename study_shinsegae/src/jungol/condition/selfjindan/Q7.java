package jungol.condition.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q7{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        char a = br.readLine().charAt(0);
        if(a == 65){
            System.out.println("Excellent");
        }
        else if(a ==66){
            System.out.println("Good");
        }
        else if(a ==67){
            System.out.println("Usually");
        }
        else if(a ==68){
            System.out.println("Effort");
        }
        else if(a ==70){
            System.out.println("Failure");
        }
        else{
            System.out.println("error");
        }











    }
}
