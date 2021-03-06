package hackerrank_YET;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class tempsaa {

	public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int count = 0;
    	if(a%2 == 0) a++;
        boolean z = isProbablePrime(BigInteger.valueOf(a), 10);
        while(a < b){
        	boolean t = isProbablePrime(BigInteger.valueOf(a+2), 10);
        	if(z && t) count++;
        	z = t;
        	a += 2;
        }
        System.out.println(count);
    }
	private static final BigInteger ZERO = BigInteger.ZERO;
	private static final BigInteger ONE = BigInteger.ONE;
	private static final BigInteger TWO = new BigInteger("2");
	private static final BigInteger THREE = new BigInteger("3");

	public static boolean isProbablePrime(BigInteger n, int k) {
		if (n.compareTo(THREE) < 0)
			return true;
		int s = 0;
		BigInteger d = n.subtract(ONE);
		while (d.mod(TWO).equals(ZERO)) {
			s++;
			d = d.divide(TWO);
		}
		for (int i = 0; i < k; i++) {
			BigInteger a = uniformRandom(TWO, n.subtract(ONE));
			BigInteger x = a.modPow(d, n);
			if (x.equals(ONE) || x.equals(n.subtract(ONE)))
				continue;
			int r = 1;
			for (; r < s; r++) {
				x = x.modPow(TWO, n);
				if (x.equals(ONE))
					return false;
				if (x.equals(n.subtract(ONE)))
					break;
			}
			if (r == s) // None of the steps made x equal n-1.
				return false;
		}
		return true;
	}

	private static BigInteger uniformRandom(BigInteger bottom, BigInteger top) {
		Random rnd = new Random();
		BigInteger res;
		do {
			res = new BigInteger(top.bitLength(), rnd);
		} while (res.compareTo(bottom) < 0 || res.compareTo(top) > 0);
		return res;
	}
}