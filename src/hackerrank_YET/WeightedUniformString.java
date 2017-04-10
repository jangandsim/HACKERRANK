package hackerrank_YET;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedUniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] out = new String[10000000];
        Arrays.fill(out, "No");
        char[] g = s.toCharArray();
        int prev = 0;
        char pre = 0;
        for(int i = 0; i < g.length; i++){
            int q = (g[i] - 'a' + 1);
            if(g[i] - pre == 0){
                q += prev;
            }
            prev = q;
            pre = g[i];
            out[q] = "Yes";
        }
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println(out[x]);
        }
    }
}
