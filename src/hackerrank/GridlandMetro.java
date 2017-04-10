package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridlandMetro {
	public static void main(String[] args) {
	    Scanner scan = new Scanner (System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    int b = scan.nextInt();
	    ArrayList<int[]> q = new ArrayList<>();
	    for(int i = 0; i < b; i++){
	        int[] g = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
	        boolean check = true;
	        for(int[] c : q){
	        	if(c[0] == g[0]){
	        		if(c[1] > g[1]){
	        			c[1] = g[1];
	        		}
	        		if(c[2] < g[2]){
	        			c[2] = g[2];
	        		}
	        		check = false;
	        	}
	        }
	        if(check){
	        	q.add(g);
	        }
	    }
	    long sum = 0;
	    for(int[] v : q){
	    	sum += v[2] - v[1] +1;
	    }
	    long out = ((long) n)*((long) m) -sum;
	    System.out.println(out);
	}
}