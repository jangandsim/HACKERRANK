package hackerrank_YET;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueensAttackII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int a0 = n - rQueen;
        int a1 = Math.min(n - rQueen, n - cQueen);
        int a2 = n - cQueen;
        int a3 = Math.min(n - cQueen, rQueen - 1);
        int a4 = rQueen - 1;
        int a5 = Math.min(rQueen - 1, cQueen - 1);
        int a6 = cQueen - 1;
        int a7 = Math.min(cQueen - 1, n - rQueen);
        for(int ai = 0; ai < k; ai++){
            int rO = in.nextInt();
            int cO = in.nextInt();
            if(rO == rQueen){
                if(cO > cQueen) {
                    if(cO - cQueen - 1 < a2){
                        a2 = cO - cQueen - 1;
                    }
                } else {
                    if(cQueen - cO - 1 < a6){
                        a6 = cQueen - cO - 1;
                    }
                }
            } else if (cO == cQueen){
                if(rO > rQueen) {
                    if(rO - rQueen - 1 < a0){
                        a0 = rO - rQueen - 1;
                    }
                } else {
                    if(rQueen - rO - 1 < a4){
                        a4 = rQueen - rO - 1;
                    }
                }
            } else {
                int p = rO - rQueen;
                int q = cO - cQueen;
                if(p == q) {
                    if(p > 0 && a1 > p - 1){
                        a1 = p - 1;
                    } else if(p < 0 && a5 > -p - 1) {
                        a5 = -p - 1;
                    }
                } else if (p == -q){
                    if(p > 0 && a7 > p - 1){
                        a7 = p - 1;
                    } else if(p < 0 && a3 > -p - 1) {
                        a3 = -p - 1;
                    }
                }
            }
        }
        
        System.out.println(a0+a1+a2+a3+a4+a5+a6+a7);
    }
}