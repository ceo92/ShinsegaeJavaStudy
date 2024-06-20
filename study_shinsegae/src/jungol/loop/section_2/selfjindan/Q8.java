package jungol.loop.section_2.selfjindan;

import java.io.*;
import java.util.*;

public class Q8{
    public static void main(String[] args) throws IOException{
        for (int i=2 ; i< 5 ; i++){
            for (int j=1 ; j<6 ; j++){
                System.out.printf("%d * %d = %d   " , i , j , i*j);
            }
            System.out.println();
        }

    }
}