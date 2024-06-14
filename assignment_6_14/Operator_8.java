package assignment_6_14;

import java.io.*;
import java.util.*;

public class Operator_8{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);

        System.out.print((a>b && a>c)? 1 : 0);
        System.out.print(" ");
        System.out.print((a==b && b==c && a==c)? 1 : 0);

    }

}