package hackerrank_YET;

import java.io.*;
import java.util.*;

public class aoefnwlekfn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = scan.nextLong();
        long size = m;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        a = getnext(a, m);
        for(int g : a){
            System.out.print(g + " ");
        }
        System.out.println();
        
    }
    static int[] getnext(int[] a, long m){
        if(m == 0){
        	return a;
        }	
        int[] b = new int[a.length];
        
        
    }
}