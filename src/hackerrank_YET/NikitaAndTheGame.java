package hackerrank_YET;

import java.io.*;
import java.util.*;

public class NikitaAndTheGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
            int b = scan.nextInt();
            int[] c = new int[b];
            long sum = 0;
            for(int j = 0; j < b; j++){
                c[j] = scan.nextInt();
                sum += c[j];
            }
            System.out.println(niki(c, 0, c.length-1, sum));
        }
    }
    static int niki(int[] a, int start, int end, long tot){
		if(tot%2 != 0 || start == end){
			return 0;
		}
		long half = tot/2;
		int mid = 0;
		for(int i = start; i <= end; i++){
			half-=a[i];
			if(half < 0){
				return 0;
			} else if(half == 0){
				mid = i;
				break;
			}
		}
		if(niki(a, start, mid, tot/2)>niki(a, mid+1, end, tot/2)){
			return niki(a, start, mid, tot/2) + 1;
		}else{
			return niki(a, mid+1, end, tot/2) + 1;
		}
    }
}