package jungol.loop.section_1.hyungsung;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int sum=0 , count = 0;
        double avg = 0.0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num <0 || num > 100){
                break;
            }
            sum += num;
            count++;
        }


        avg = (double)sum /count;
        sb.append("sum : ").append(sum).append("\n").append("avg : ").append(String.format("%.1f" , avg));
        bw.write(sb.toString());
        bw.flush();
        bw.close();






    }
}