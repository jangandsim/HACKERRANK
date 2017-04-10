package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadsandLibraries {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int[][] gg = new int[n][n];
            for(int a1 = 0; a1 < m; a1++){
                int c1 = in.nextInt()-1;
                int c2 = in.nextInt()-1;
                gg[c1][c2] = 1;
            }
            
            if(x <= y){
                System.out.println(x*n);
            } else {
                System.out.println((gg));
            }
        }
    }
	public static int nogg(int[][] a){
		int count = 0;
		ArrayList<Integer> che = new ArrayList<>();
		for(int i = 0; i < a.length; i++) che.add(i);
		while(!che.isEmpty()){
			count++;
			che = cccc(a,che);
		}
		return 0;
	}
	public static ArrayList<Integer> cccc(int[][] a, ArrayList<Integer> b){
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(b.get(0));
		b.remove(0);
		while(!temp.isEmpty()){
			for(int i = 0; i < a[0].length; i++){
				if(a[temp.get(0)][i] != 0){
					temp.add(i);
				}
			}
			temp.remove(0);
		}
		return b;
	}
}