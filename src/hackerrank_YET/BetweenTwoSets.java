package hackerrank_YET;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        int a = in.nextInt();
        for(int a_i=0; a_i < n-1; a_i++){
            a = lcm(a, in.nextInt());
        }
        int b = in.nextInt();
        for(int b_i=0; b_i < m-1; b_i++){
            b = gcd(b, in.nextInt());
        }
        if(a > b){
        	System.out.println(0);
        } else{
	        for(int i = a; i <= b; i++){
	        	if(b % i == 0 && i%a == 0){
	        		count++;
	        	}
	        }
	        System.out.println(count);
        }
        
    }
    static int gcd(int a, int b) {
    	if(b == 0){
    		return a;
    	} else {
    		return gcd(b, a%b);
    	}
    }
    static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }
}
