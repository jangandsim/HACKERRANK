package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> c = new ArrayList<>();
        int z = 0;
        for(int c_i=0; c_i < n; c_i++){
            int d = in.nextInt();
            if(c.contains(d)){
            	z++;
            	c.remove(new Integer(d));
            } else {
            	c.add(d);
            }
        }
        System.out.println(z);
    }
}
