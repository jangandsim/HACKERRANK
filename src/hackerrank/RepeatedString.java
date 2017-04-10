package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long b = s.length();
        char[] c = s.toCharArray();
        long d = 0;
        for(int i = 0; i < c.length; i++){
        	if(c[i] == 'a'){
        		d++;
        	}
        }
        long e = (n/b)*d;
        long f = n%b;
        for(int j = 0; j < f; j++){
        	if(c[j] == 'a'){
        		e++;
        	}
        }
        System.out.println(e);
    }
}
