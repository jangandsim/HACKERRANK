package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        char[] c = s.toCharArray();
        char[] sets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean check = true;
        int out = 0;
        for(int i = 0; i < 25; i++){
        	for(int j = i+1; j < 26; j++){
        		String temp = s;
        		for(int k = 0; k < 26; k++){
        			if(k != i && k !=j){
        				temp = temp.replace(Character.toString(sets[k]), " ");
        			}
        		}
        		char[] q = temp.toCharArray();
        		for(int l = 0; l < q.length-1; l++){
        			if(q[l] == q[l+1]){
        				temp = temp.replace(Character.toString(q[l]), "");
        				break;
        			}
        		}
        		q = temp.toCharArray();
        		for(int l = 0; l < q.length-1; l++){
        			if(q[l] == q[l+1]){
        				temp = temp.replace(Character.toString(q[l]), "");
        				break;
        			}
        		}
        		if(temp.length() > out){
        			out = temp.length();
        		}
        	}
        }
        System.out.println(out);
    }
}