package hackerrank;

import java.io.*;
import java.util.*;

public class PermutingTwoArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
        	int b = scan.nextInt();
        	int c = scan.nextInt();
        	String check = "YES";
        	int[] d = new int[b];
        	int[] e = new int[b];
        	int[] f = new int[b];
        	for(int j = 0; j < b; j++){
        		d[j] = scan.nextInt();
        	}
        	for(int k = 0; k < b; k++){
        		e[k] = scan.nextInt();
        	}
        	Arrays.sort(d);
        	Arrays.sort(e);
        	for(int l = 0; l < b; l++){
        		if(d[l]+e[b-1-l] <c){
        			check = "NO";
        		}
        	}
        	System.out.println(check);
        	
        }
    }
}