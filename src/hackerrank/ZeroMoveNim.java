package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroMoveNim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] p = new int[n];
            int[] q = new int[n];
            int tot = 0;
            for(int p_i=0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
                tot += p[p_i];
            }
            if(nexttu(p, q, 1, tot) == 0){
            	System.out.println("L");
            } else {
            	System.out.println("W");
            }
        }
    }
    static int nexttu(int[] a, int[] b, int c, int tot){
    	if(tot == 0){
    		if(c == 1){
    			return 0;
    		} else {
    			return 1;
    		}
    	}
    	int k = 1; 
    	if(c == 1){
    		k = 0;
    	}
    	for(int i = 0; i < a.length; i++){
    		for(int j = b[i]; j < a[i]; j++){
    			int[] tempa = Arrays.copyOf(a, a.length);
    			int[] tempb = Arrays.copyOf(b, b.length);
    			tempa[i] -= j;
    			tot -= j;
    			if(j == 0){
    				tempb[i] = 1;
    			}
    			if(c == 1){
        			k |= nexttu(tempa, tempb, c^1, tot);
        			if(k == 1){
        				return 1;
        			}
        		} else {
        			k *= nexttu(tempa, tempb, c^1, tot);
        			if(k == 0){
        				return 0;
        			}
        		}
    		}
    	}
    	return k;
    }
}