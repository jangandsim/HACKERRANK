package hackerrank;

import java.io.*;
import java.util.*;

public class StoneDivision {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long tot = scan.nextLong();
        ArrayList<Long> a = new ArrayList<>();
        a.add(tot);
        int b = scan.nextInt();
        long[] divs = new long[b];
        long out = scan.nextLong();
        for(int i = 1; i < b; i++){
            out = out ^ scan.nextLong();
        } 
        if((out) == 0){
        	System.out.println("First");
        } else {
        	System.out.println("Second");
        }
        
    }
    static int whowins(ArrayList<Long> a, long[] b, int c){
		if(a.isEmpty()){
			return (c+1)%2;
		}
    	for(int i = 0; i < a.size(); i++){
            ArrayList<Long> tem  = new ArrayList<>(a);
    		long temp = tem.get(i);
    		tem.remove(i);
    		for(long e : b){
                ArrayList<Long> tem2  = new ArrayList<>(tem);
    			if(temp%e == 0){
    				for(int j = 0; j < e; j++){
    				tem2.add(temp/e);
    				}
    				if(whowins(tem2, b, (c+1)%2) == c){
    					return c;
    				}
    			}
    		}
    	}
    	return (c+1)%2;
    }
    
}