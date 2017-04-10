package hackerrank;

import java.io.*;
import java.util.*;

public class MarkAndToys {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int b = scan.nextInt();
    	int[] c = new int[n];
    	for(int i = 0; i < n; i++){
    		c[i] = scan.nextInt();
    	}
    	Arrays.sort(c);
    	int k = 0;
    	int count = 0;
    	while(b >= c[k]){
    		b -= c[k];
    		k++;
    		count++;
    	}
    	System.out.println(count);
    	
    	
    }
}