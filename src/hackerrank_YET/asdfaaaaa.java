package hackerrank_YET;
import java.io.*;
import java.util.*;

public class asdfaaaaa {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long m = scan.nextLong();
        long size = m;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(scan.nextInt());
        }
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        temp.add(a);
        long unit = 30;
        long rest = 30;
        while(--m > 0){
            a = getnext(a);
            if(temp.contains(a)){
            	unit = temp.size()-temp.indexOf(a);
            	rest = temp.size()-unit;
            	size = (size-rest)%unit;
            	while(--size >= 0){
    	            a = getnext(a);
    	        }
            	break;
            }
        }
        for(int g : a){
            System.out.print(g + " ");
        }
        
    }
    static ArrayList<Integer> getnext(ArrayList<Integer> a){
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < a.size()-1; i++){
            b.add(a.get(i)^a.get(i+1));
        }
        b.add(a.get(a.size()-1)^a.get(0));
        return b;
    }
}

