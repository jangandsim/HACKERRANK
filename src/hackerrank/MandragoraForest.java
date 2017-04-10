package hackerrank;

import java.io.*;
import java.util.*;

public class MandragoraForest {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	for(int i = 0; i < a; i++){
    		int b = scan.nextInt();
    		long[] c = new long[b];
    		long tot = 0;
    		for(int j = 0; j < b; j++){
    			c[j] = scan.nextInt();
    			tot+=c[j];
    		}
    		Arrays.sort(c);
    		long sum1 = 1*tot;
    		long pros = tot - c[0];
    		long sum2 = 2*(pros);
    		int count = 1;
    		while(sum1 < sum2){
    			sum1 = sum2;
    			pros -= c[count];
    			sum2 = (count+2)*pros;
    			count++;
    		}
    		System.out.println(sum1);
    	}
    }
}