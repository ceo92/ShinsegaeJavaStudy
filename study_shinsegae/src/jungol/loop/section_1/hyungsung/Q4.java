package jungol.loop.section_1.hyungsung;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(x ==0) break;
            if(x % 3 ==0 || x % 5 == 0 ) continue;
            count++;



        }
        System.out.println(count);







    }
}
