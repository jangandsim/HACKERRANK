package hackerrank_YET;

import java.io.*;
import java.util.*;

public class XORMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = scan.nextLong();
        long size = m;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        List<int[]> temp = new ArrayList<>();
        temp.add(a);
        long unit = 0;
        long rest = 0;
        while(--m > 0){
            a = getnext(a);
            
            
        }
        for(int g : a){
            System.out.print(g + " ");
        }
        System.out.println();
        
    }
    static int[] getnext(int[] a){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length-1; i++){
            b[i] = a[i]^a[i+1];
        }
        b[a.length-1] = a[a.length-1]^a[0];
        return b;
    }
}