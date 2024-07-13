package jungol.operator.hyungsung;

import java.io.*;
import java.util.StringTokenizer;

public class Hyungsung2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);


        System.out.printf("%d / %d = %d...%d" , a,b,a/b,a%b);





    }
}