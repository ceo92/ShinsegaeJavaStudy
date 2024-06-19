package jungol.loop.section_3.hyungsung;

import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0 ; i<n ; i++){ //1 2 3
            for (int j = 0 ; j<i ; j++){ //0 1 2
                System.out.print(" ");
            }
            for (int j = i ; j<n*2-i-1 ; j++){ //5 3 1
                System.out.print("*");
            }
            for (int j = 0 ; j<i ; j++){ //0 1 2
                System.out.print(" ");
            }
            System.out.println();
        }

        //점점 커져 : 커지는 수에 곱하기 +
        //점점 작아져 : 커지는 수에 곱하기
        for (int i=1 ; i<n ; i++) { //1 2
            for (int j = n - i - 1; j > 0; j--) { //1 0
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) { //3입력 => 3 5 7 9
                System.out.print("*");
            }
            for (int j = n - i - 1; j > 0; j--) { //1 0
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
