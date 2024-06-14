package assignment_6_14;

import java.io.*;
import java.util.*;

public class Operator_1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum=0 , count=0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
            count++;
        }
        System.out.println("sum : "+sum);
        System.out.println("avg : "+sum/count);
    }

}