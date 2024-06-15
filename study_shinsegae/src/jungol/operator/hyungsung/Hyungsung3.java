package jungol.operator.hyungsung;

import java.io.*;
import java.util.StringTokenizer;

public class Hyungsung3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);


        System.out.println("width = "+(a+5));
        System.out.println("length = "+(b*2));
        System.out.println("area = "+((b*2) * (a+5)));





    }
}