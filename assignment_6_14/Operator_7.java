package assignment_6_14;

import java.io.*;
import java.util.*;

public class Operator_7{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        boolean x = (a != 0) ? true : false;
        boolean y = (b != 0) ? true : false;

        System.out.print((x && y) + " " +(x || y));






    }

}