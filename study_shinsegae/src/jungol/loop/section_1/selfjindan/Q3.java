package jungol.loop.section_1.selfjindan;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("number? ");
            int a = Integer.parseInt(br.readLine());
            if(a>0) System.out.println("positive integer");
            else if(a < 0) System.out.println("negative number");
            else break;
        }



    }
}