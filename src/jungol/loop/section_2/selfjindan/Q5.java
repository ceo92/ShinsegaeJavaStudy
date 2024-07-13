package jungol.loop.section_2.selfjindan;

import java.io.*;
import java.util.*;

public class Q5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int threeCount = 0;
        int fiveCount = 0;
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(x % 3==0) threeCount++;
            if(x % 5==0) fiveCount++;
        }
        System.out.println("Multiples of 3 : "+threeCount);
        System.out.println("Multiples of 5 : "+fiveCount);



    }
}