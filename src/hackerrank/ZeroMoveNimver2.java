package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroMoveNimver2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] p = new int[n];
            for(int p_i=0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            int k = 0;
            for(int i : p){
            	k = k^(i+1);
            }
            if(k > 0){
            	System.out.println("W");
            } else {
            	System.out.println("L");
            }
        }
    }
}