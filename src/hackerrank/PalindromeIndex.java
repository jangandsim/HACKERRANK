package hackerrank;

import java.io.*;
import java.util.*;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
        	String a = scan.next();
        	char[] b = a.toCharArray();
        	int out = -1;
        	outloop:
        	for(int j = 0; j < b.length/2; j++){
        		if(b[j] != b[b.length-1-j]){
        			int z = 0;
        			while(true){
	        			if(b[j] == b[b.length-2-j] && b[j+1] != b[b.length-1-j]){
	        				out = b.length-1-j+z;
		        			break outloop;
	        			} else if((b[j] != b[b.length-2-j] && b[j+1] == b[b.length-1-j])){
	        				out = j-z;
		        			break outloop;
	        			}
	        			j++;
	        			z++;
	        			
        			}
        		}
        	}
        	System.out.println(out);
        }
    }
}