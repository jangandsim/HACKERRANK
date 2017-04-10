package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackonacciMatrixRotations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] che = {1, 0, 0, 1, 1, 1, 0};
        int[][] mat = new int[n][n];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                mat[i-1][j-1] = che[((i*j)*(i*j)+4)%7];
            }
        }
        int ttt1 = 0;
        for(int i2 = 1; i2 <= n; i2++){
            for(int j2 = 1; j2 <= n; j2++){
                if(mat[i2-1][j2-1] != mat[i2-1][n-j2]) ttt1++;
            }
        }
        int ttt2 = 0;
        for(int i3 = 1; i3 <= n; i3++){
            for(int j3 = 1; j3 <= n; j3++){
                if(mat[i3-1][j3-1] != mat[n-i3][n-j3]) ttt2++;
            }
        }
        int[] ppp = {0, ttt1, ttt2, ttt1};
        for(int a0 = 0; a0 < q; a0++){
            int angle = (in.nextInt()%360)/90;
            System.out.println(ppp[angle]);
        }
    }
}