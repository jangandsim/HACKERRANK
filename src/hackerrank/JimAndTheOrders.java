package hackerrank;

import java.io.*;
import java.util.*;

public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        ArrayList<int[]> b = new ArrayList<>();
        for(int i = 0; i < a; i++){
        	int[] c = {scan.nextInt()+scan.nextInt(), i+1};
        	b.add(c);
        }
        while(!b.isEmpty()){
        	int[] d = b.get(0);
        	for(int[] e : b){
        		if(d[0] > e[0]){
        			d = e;
        		}
        	}
        	System.out.print(d[1]);
        	b.remove(d);
        }

    }
}