package jungol.loop.section_1.selfjindan;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0 , count = 0;

        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            sum+=a;
            count++;
            if(a >= 100) break;
        }
        System.out.println(sum);
        System.out.printf("%.1f" , (double)sum/count);



    }
}