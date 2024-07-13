package jungol.condition.hyungsung;

import java.io.*;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int year = Integer.parseInt(br.readLine());
        if(year % 400 ==0 || (year % 4 ==0 && year % 100 != 0) ){
            sb.append("leap").append(" ").append("year");
        }
        else{
            sb.append("common").append(" ").append("year");
        }
        bw.write(sb.toString());
        bw.flush();



    }
}