package jungol.loop.section_2.selfjindan;

import java.io.*;
import java.util.*;

public class Q6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum=0 , count = 0;
        for(int i=0 ; i<a ; i++){
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            count++;
        }
        System.out.printf("avg : %.1f\n" ,(double)sum/count);

        if((double)sum/count >= 80){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }




    }
}