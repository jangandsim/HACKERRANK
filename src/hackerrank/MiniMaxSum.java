package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long tot = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < 5; i++){
        	int a = in.nextInt();
        	min = Math.min(min, a);
        	max = Math.max(max, a);
        	tot += a;
        }
        System.out.print(tot - max);
        System.out.print(" ");
        System.out.print( tot - min);
    }
}	