package jungol.operator.hyungsung;

import java.io.*;
import java.util.StringTokenizer;

public class Hyungsung4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] minsu = br.readLine().split(" ");
        int a = Integer.parseInt(minsu[0]);
        int b = Integer.parseInt(minsu[1]);

        String[] giyoung = br.readLine().split(" ");
        int c = Integer.parseInt(giyoung[0]);
        int d = Integer.parseInt(giyoung[1]);

        System.out.println(a > c && b > d);

    }
}