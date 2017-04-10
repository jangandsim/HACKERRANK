package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
        long t = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        int m = in.nextInt();
        int n = in.nextInt();
        long ca = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            long k = in.nextLong()+a;
            if(k >= s && k <= t){
                ca++;
            }
        }
        System.out.println(ca);
        long cb = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            long k = in.nextLong()+b;
            if(k >= s && k <= t){
                cb++;
            }
        }
        System.out.println(cb);
    }
}
