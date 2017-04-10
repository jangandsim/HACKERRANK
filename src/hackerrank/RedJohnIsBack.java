package hackerrank;

import java.io.*;
import java.util.*;

public class RedJohnIsBack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int b = 0; b < a; b++){
        	int c = scan.nextInt();
        	int count = 1;
        	for(int i = 1; i <= c/4; i++){
        		count += boxbox(i,c);
        	}
        	System.out.println(primes(count));
        }
    }
    static int boxbox(int n, int m){
    	int c = m-3*n;
    	int d = 1;
    	int up = 1;
    	int dow = 1;
    	while(n > 0){
    		dow *= d++;
    		up *= c--;
    		n--;
    	}
		return up/dow;
    }
    static int primes(int n){
    	int z = 0;
    	if(n < 2){
    		return 0;
    	}
    	for(int i = 2; i <= n; i++){
    		if(isprime(i)){
    			z++;
    		}
    	}
		return z;
    }
    static boolean isprime(int a){
    	for(int i = 2; i*i <= a; i++){
    		if(a%i == 0){
    			return false;
    		}
    	}
    	return true;
    }
}