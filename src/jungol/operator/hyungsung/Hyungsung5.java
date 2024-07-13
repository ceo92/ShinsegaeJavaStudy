package jungol.operator.hyungsung;

import java.io.*;
import java.util.StringTokenizer;

public class Hyungsung5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0 , count = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
            count++;
        }
        sb.append("sum ").append(sum).append("\n").append("avg ").append(sum/count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}