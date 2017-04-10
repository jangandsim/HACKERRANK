package hackerrank;

import java.io.*;
import java.util.*;

public class FlippingtheMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
        	int b = scan.nextInt();
        	int[][] c = new int[2*b][2*b];
        	for(int j = 0; j < 2*b; j++){
        		for(int k = 0; k < 2*b; k++){
        			c[j][k] = scan.nextInt();
        		}
        	}
        	int out = 0;
        	for(int j = 0; j < b; j++){
        		for(int k = 0; k < b; k++){
        			out += Math.max(Math.max(c[j][k], c[2*b-1-j][k]), Math.max(c[j][2*b-1-k], c[2*b-1-j][2*b-1-k]));
        		}
        	}
        	System.out.println(out);
        	
        }
    }
}