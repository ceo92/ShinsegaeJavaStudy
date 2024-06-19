package jungol.loop.section_2.hyungsung;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        double avg=0.0;
        int sum=0 , count=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
            count++;
        }

        avg = (double)sum/count;
        sb.append(String.format("%.2f" , avg));
        bw.write(sb.toString());
        bw.flush();
        bw.close();






    }
}