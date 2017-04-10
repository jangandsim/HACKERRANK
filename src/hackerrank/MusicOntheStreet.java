package hackerrank;

import java.io.*;
import java.util.*;

public class MusicOntheStreet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int[] g = new int[n];
        for(int i = 0; i < n; i++){
            g[i] = scan.nextInt();
        }
        
        int m = scan.nextInt();
        int hmin = scan.nextInt();
        int hmax = scan.nextInt();
        int countm = 0;
        int out = 0;
        
        for(int j = 0; j < n; j++){
            int[] ggg = checker(g, j, m, hmin, hmax, n);
            if(ggg[0] > countm){
                countm = ggg[0];
                out = ggg[1];
            }
        }
        System.out.println(out);
    }
    static int[] checker(int[] array, int start, int maxdis, int hmin, int hmax, int nn){
        int count1 = 0;
        int count2 = 0;
        int startloc1 = array[start] - hmin;
        int startloc2 = array[start] - hmax;
        int si1 = start;
        int si2 = start;
        while(si1 < nn && array[si1] - startloc1 <= maxdis){
            if(si1 == 0){
                count1++;
            } else {
                if(array[si1] - array[si1-1] >= hmin && array[si1] - array[si1-1] <= hmax){
                    count1++;
                }
            }
            si1++;
        }
        if(startloc1 + maxdis - array[si1 -1] >= hmin && startloc1 + maxdis - array[si1 -1] <= hmax){
            count1++;
        }
        while(si2 < nn && array[si2] - startloc2 <= maxdis){
            if(si2 == 0){
                count2++;
            } else {
                if(array[si2] - array[si2-1] >= hmin && array[si2] - array[si2-1] <= hmax){
                    count2++;
                }
            }
            si2++;
        }
        if(startloc2 + maxdis - array[si2 -1] >= hmin && startloc2 + maxdis - array[si2 -1] <= hmax){
            count2++;
        }
        if(count1 > count2){
            int[] oo = {count1, startloc1};
            return oo;
        } else {
            int[] oo = {count2, startloc2};
            return oo;
        }
    }
}