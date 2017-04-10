package hackerrank;

import java.io.*;
import java.util.*;

public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for(int i = 0; i < a; i++){
        	b[i] = scan.nextInt();
        }
        boolean check = false;
        int[] max = new int[3];
        int longest = 0;
        for(int x = 0; x < a-2; x++){
        	for(int y = x+1; y < a-1; y++){
        		for(int z = y+1; z < a; z++){
        			if(b[z]<b[x]+b[y] && b[x]+b[y]+b[z]> longest){
        				max[0] = b[x];
        				max[1] = b[y];
        				max[2] = b[z];
        				check = true;
        				longest = b[x]+b[y]+b[z];
        			}
        		}
        	}
        }
        if(check){
        	System.out.printf("%d %d %d", max[0],max[1],max[2]);
        } else {
        	System.out.println(-1);
        }
        
    }
}