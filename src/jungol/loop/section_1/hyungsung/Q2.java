package jungol.loop.section_1.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int oddCount = 0;
        int evenCount = 0;
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(x ==0) break;

            if(x % 2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }

        }
        System.out.println("odd : "+oddCount);
        System.out.println("even : "+evenCount);






    }
}
