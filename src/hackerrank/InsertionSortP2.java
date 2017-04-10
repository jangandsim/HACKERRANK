package hackerrank;
import java.io.*;
import java.util.*;

public class InsertionSortP2 {

    public static void insertionSortPart2(int[] ar){
    	for(int i = 1; i < ar.length; i++){
    		if(ar[i] < ar[i-1]){
    			int n = i;
    			while(n > 0 && ar[n] < ar[n-1]){
    				int temp = ar[n-1];
    				ar[n-1] = ar[n];
    				ar[n] = temp;
    				n--;
    			}               
    		}
    		printArray(ar);
    	}
           
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
