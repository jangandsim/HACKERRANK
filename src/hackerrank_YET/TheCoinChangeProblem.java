package hackerrank_YET;

import java.io.*;
import java.util.*;
public class TheCoinChangeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[b];
        for(int d = 0; d < b; d++){
        	c[d] = scan.nextInt();
        }
        System.out.println(coins(c, a));
    }

	private static long coins(int[] c, int a) {
		int out = 0;
		for(int b : c) {
		    if (a - b > 0) {
		        out += coins(c, a-b);
		    }
		}
	    return out;
	}
}