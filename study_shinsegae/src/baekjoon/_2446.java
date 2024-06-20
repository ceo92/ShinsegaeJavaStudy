package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2446 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for(int i=0 ; i<x ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }

            for(int j=2*x-1-i ; j>i ; j--){
                System.out.print("*");
            }

            System.out.println();

        }
        for(int i=0 ; i<x-1 ; i++){
            for(int j=x-2-i ; j>0 ; j--){
                System.out.print(" ");
            }

            for(int j=0 ; j<2*i+3 ; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}




