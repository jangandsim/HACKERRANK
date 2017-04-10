package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadybugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            boolean check = true;
            if(b.length() > 1){
	            if(b.contains("_")){
	            	b = b.replaceAll("_", "");
	            	char[] c = b.toCharArray();
	            	Arrays.sort(c);
	            	check = checker(c);
	            	//for(char w : c)	System.out.println(w);
	            } else {
	            	char[] c = b.toCharArray();
	            	check = checker(c);
	            }
            } else {
            	if(b.contains("_")){
            		check = true;
            	} else {
            		check = false;
            	}
            }
            if(check){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
        }
    }
    static boolean checker(char[] z){
    	if(z.length == 0){
    		return true;
    	}
    	if(z.length == 1 || z[0] != z[1] || z[z.length-1] != z[z.length-2]){
    		return false;
    	}
    	for(int i = 1; i < z.length-1; i++){
    		if(z[i] != z[i-1] && z[i] != z[i+1]){
    			return false;
    		}
    	}
    	return true;
    }
}

