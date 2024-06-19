package jungol.loop.section_1.hyungsung;

import java.io.*;
import java.util.*;

public class Q5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String con;
        do{
            int width = Integer.parseInt(br.readLine());
            int height = Integer.parseInt(br.readLine());
            System.out.print("Base = Height = Triangle width = ");
            System.out.printf("%.1f\n" , (double)width * height / 2);
            System.out.print("Continue? ");
            con = br.readLine();

        }while(con.equals("Y") || con.equals("y"));





    }
}
