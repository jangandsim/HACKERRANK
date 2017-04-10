package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        Arrays.sort(x);
        int j = 0;
        int l = 0;
        int z = 0;
        int q = 0;
        while(j < x.length){
        	if(z < x[j]){
        		l++;
        		q = x[j] + k;
        		z = x[j] + k;
        	} else if(x[j] <= q){
        		z = x[j] + k;
        	}
        	j++;
        }
        System.out.println(l);
    }
}
