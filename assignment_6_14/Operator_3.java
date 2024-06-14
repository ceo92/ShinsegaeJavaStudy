package assignment_6_14;

import java.io.*;
import java.util.*;

public class Operator_3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a++);
        System.out.println(++a);

    }

}