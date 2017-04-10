package hackerrank_YET;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyNumberEight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()+2;
        String number = in.next() +"00";
        long g = 0;
        long l = 1;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
            	for(int k = j+1; k < n; k++){
            		if(((number.charAt(i)-'0')*100+(number.charAt(j)-'0')*10+(number.charAt(k)-'0'))%8 == 0){
            			g += l;
            		}
            	}
            }
            l = (l*2)%1000000007;
            g = g%1000000007;
        }
        System.out.println(g);
    }
}