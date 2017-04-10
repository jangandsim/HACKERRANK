package hackerrank;

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
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = a[n-1]; i <= b[0]; i++){
            boolean checka = true;
            boolean checkb = true;
            for(int z : a){
                if(i%z != 0) {
                    checka = false;
                    break;
                }
            }
            for(int y : b){
                if(y%i != 0) {
                    checkb = false;
                    break;
                }
            }
            if(checka && checkb){
                count++;
            }
        }
        System.out.println(count);
    }
}
