package hackerrank;

import java.io.*;
import java.util.*;

public class HardHomework {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double max = Double.MIN_VALUE;
        uploop:
        for(int i = 1; i < n-1; i++){
            for(int j = i; j < n-1; j++){
                if(i + j > n-1) break;
                double k = oo(i, j, n-i-j);
                if(k > max) max = k;
                if(max == 3) break uploop;
            }
        }
        System.out.printf("%.2f", max);
    }
    static double oo(int a, int b,  int c){
        return Math.sin(a)+Math.sin(b)+ Math.sin(c);
    }
}