package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
            int b = scan.nextInt();
            int[] c = new int[b];
            for(int k = 0; k < b; k++){
                c[k] = scan.nextInt();
            }
            System.out.printf("%d %d \n",continu(c), notcontinu(c));
        }
    }
    static int continu(int[] x){
		int temp = 0;
		int ret = x[0];
		for(int a : x){
			if(temp + a > 0){
				temp += a;
			} else {
				if(a > ret){
					ret = a;
				}
				temp = 0;
			}
			if(temp!=0&& temp > ret){
				ret = temp;
			}
		}
    	return ret;
    }
    static int notcontinu(int[] x){
		int ret = 0;
		int min = x[0];
		int count = 0;
		for(int a : x){
			if(a>0){
				ret += a;
				count++;
			}
			if(a > min){
				min = a;
			}
		}
		if(count == 0){
			ret = min;
		}
    	return ret;
    }
}