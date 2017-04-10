package hackerrank;

import java.io.*;
import java.util.*;

public class ShortPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next(); 
        
    }
    String countHighestPower(String N) {
        int a = Integer.parseInt(N);
        int out = 0;
        int i;
        for(i = 1; i <= a/2; i++){
            out += check(i);
        }
        out += i;
        return  Integer.toString(out);
}
int check(int a){
    if(a%2 == 0){
        return 1+check(a/2);
    } else {
        return 0;
    }
    
}
    
}