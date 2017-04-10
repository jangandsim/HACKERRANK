package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class asdfewf {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Set<Double> b = new HashSet<>();
        long result = 0;
        for (int i = 0; i < n; i++) {
        	double val = a[i];
        	double temp = Math.ceil(val / p);
        	while (b.contains(temp)) {
        		temp++;
        	}
        	b.add(temp);
        	result += (long) temp;
        }
        
        System.out.println(result);
    }
}
