package jungol.operator;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a++);
        System.out.println(++a);

    }

}