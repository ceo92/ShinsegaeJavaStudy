package jungol.operator.self;

import java.io.*;

public class Self3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a++);
        System.out.println(++a);

    }

}