package hackerrank;

import java.io.*;
import java.util.*;
public class TheCoinChangeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[b];
        for(int d = 0; d < b; d++){
        	c[d] = scan.nextInt();
        }
        Arrays.sort(c);
        System.out.println(coins(c, a, b-1));
    }

	private static long coins(int[] c, int a, int z) {
		long out = 0;
		if(a < 0 || z < 0 || (z == 0 && a%c[0] != 0)){
			return 0;
		}
		if(z == 0 && a%c[0] == 0){
			return 1;
		}
		for(int i = 0; i <= a/c[z]; i++){
			out += coins(c, a - i*c[z], z-1);
		}
		return out;
	}
}