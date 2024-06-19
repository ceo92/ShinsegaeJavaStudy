package jungol.loop.section_1.selfjindan;

import java.io.*;
import java.util.*;

public class Q6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.println("number? ");
            String x = br.readLine();

            switch(Integer.parseInt(x)){
                case 1:
                    System.out.println("Seoul");
                    continue;

                case 2:
                    System.out.println("Washington");
                    continue;

                case 3:
                    System.out.println("Tokyo");
                    continue;

                case 4:
                    System.out.println("Beijing");
                    continue;

                default:
                    System.out.println("none");
                    return;

            }
        }



    }
}