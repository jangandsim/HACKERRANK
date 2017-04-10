package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort2Sorting {
	static ArrayList<Integer> QuickSort(ArrayList<Integer> ar){
    	ArrayList<Integer> l = new ArrayList<>();
    	ArrayList<Integer> r = new ArrayList<>();
    	int c = ar.get(0);
    	for(int i = 1; i < ar.size(); i++){
    		if(ar.get(i) < c){
    			l.add(ar.get(i));
    		} else {
    			r.add(ar.get(i));
    		}
    	}
    	if(l.size()>1){
    		l = QuickSort(l);
    	}
    	if(r.size()>1){
    		r = QuickSort(r);
    	}
    	ArrayList<Integer> nar = new ArrayList<>();
    	nar.addAll(l);
    	nar.add(c);
    	nar.addAll(r);
    	printArray(nar);
    	return nar;
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       ArrayList<Integer> k = new ArrayList<>();
       for(int i=0;i<s;i++){
            k.add(in.nextInt()); 
       }
       QuickSort(k);    
                    
    }    
    private static void printArray(ArrayList<Integer> ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
