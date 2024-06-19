package jungol.loop.section_2.hyungsung;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=1 ; i<=a ; i++){
            if(i % 5 ==0) sum+=i;

        }
        System.out.println(sum);





    }
}
