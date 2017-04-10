package hackerrank;
import java.io.*;
import java.util.*;

public class QuickSort1Partition {

    public static void QuickSort(int[] ar){
    	ArrayList<Integer> l = new ArrayList<>();
    	ArrayList<Integer> r = new ArrayList<>();
    	int c = ar[0];
    	for(int i = 1; i < ar.length; i++){
    		if(ar[i] < c){
    			l.add(ar[i]);
    		} else {
    			r.add(ar[i]);
    		}
    	}
    	for(int x : l){
    		System.out.print(x + " ");
    	}
    	System.out.print(c + " ");
    	for(int y : r){
    		System.out.print(y + " ");
    	}
           
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       QuickSort(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}