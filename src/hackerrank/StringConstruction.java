package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] alph = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            int count = 0;
            for(int i = 0; i < alph.length; i++){
            	if(s.indexOf(alph[i])>=0){
            		count++;
            	}
            }
            System.out.println(count);
        }
    }
}
