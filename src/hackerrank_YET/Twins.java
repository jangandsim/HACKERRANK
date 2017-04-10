package hackerrank_YET;

import java.io.*;
import java.util.*;

public class Twins {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
    	long a = scan.nextLong();
    	long b = scan.nextLong();
    	int count = 0;
    	for(long i = a; i < b-1; i++){
    		if(isprime(i) && isprime(i+2)){
    			count++;
    		}
    	}
    	System.out.println(count);
    }
    static boolean isprime(long i){
    	if(i == 2 || i ==3){
    		return true;
    	}
    	for(int j = 0; j < 3; j++){
    		long x = 3+(long)(Math.random()*((double)(i-4)));
    		if(modu(x, i-1, i) != 1){
    			return false;
    		}
    	}
    	return true;
    }
    static long modu(long a, long b, long c){
    	long out = 1;
    	while(b > 0){
    		out *= a;
    		out %= c;
    		b--;
    	}
    	return out;
    }
}
