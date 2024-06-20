package baekjoon;

import java.io.*;

public class _2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            for (int j=a;j>i+1;j--){
                sb.append(" ");
            }
            for (int k=0;k<i+1;k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}




