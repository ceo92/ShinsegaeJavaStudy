package baekjoon;

import java.io.*;

public class _2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int p=0;
        for (int i=0 ; i<N ; i++){
            for (int j=i ; j<N-1 ;j++){ //4 3 2 1
                sb.append(" ");
            }
            for (int j = 0; j<p+1 ; j++){
                sb.append("*");
            }
            p+=2;
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        sb.setLength(0);
        for (int i=0;i<N ;i++){
            for (int j=N;j>N-i-1;j--){
                sb.append(" ");
            }
            p-=2;
            for (int j=0 ; j<p-1 ; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }
}





