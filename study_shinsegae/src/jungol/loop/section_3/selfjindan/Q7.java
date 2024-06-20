package jungol.loop.section_3.selfjindan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char c = 'A';
        int x=1;
        for (int i=0 ; i<n ; i++){
            for (int j = i ; j<n ; j++){
                System.out.print(j+1+" ");
            }

            for (int j=c ; j< c+i+1 ; j++){
                System.out.print((c+=j)+" ");
            }
            System.out.println();
        }


    }
}
