package jungol.operator.self;

import java.io.*;

public class Self4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        StringBuilder sb = new StringBuilder();

        int multiply = (a++) * (--b);
        sb.append(a).append(" ").append(b).append(" ").append(multiply);
        System.out.println(sb.toString());




    }

}