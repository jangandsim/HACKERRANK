package hackerrank_YET;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSortInPlace {
	static int[] QuickSort(int[] a, int b, int pi){
    	int lowg = -1;
    	for(int i = b; i < pi; i++){
    		if(a[i] > a[pi]){
    			if(lowg < 0){
    				lowg = i;
    			}
    		} else {
    			if(lowg >= 0){
    				int temp1 = a[i];
    				a[i] = a[lowg];
    				a[lowg] = temp1;
    				lowg++;
    			}
    		}
    	}
        if(lowg >= 0){
            int temp2 = a[pi];
            a[pi] = a[lowg];
            a[lowg] = temp2;
        }
        for(int n: a){
            System.out.print(n+" ");
         }
           System.out.println("");
		if(lowg - b > 1){
			a = QuickSort(a, b, lowg-1);
		}
		if(pi - lowg > 1){
			a = QuickSort(a, lowg+1, pi);
		}
        return a;
    }   
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] k = new int[s];
       for(int i=0;i<s;i++){
            k[i] = in.nextInt(); 
       }
       QuickSort(k,0,k.length-1); 
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

