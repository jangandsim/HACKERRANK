package hackerrank;
import java.io.*;
import java.util.*;

public class GridChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0; i < a; i++){
        	int b = scan.nextInt();
        	char[][] x = new char[b][b];
        	scan.nextLine();
        	boolean check = true;
        	for(int j = 0; j < b; j++){
        		String c = scan.nextLine();
        		char[] d = c.toCharArray();
        		Arrays.sort(d);
        		x[j] = d;
        	}
        	outloop:
        	for(int k = 0; k < b-1; k++){
        		for(int l = 0; l < b; l++){
        			if(x[k][l]-x[k+1][l]>0){
        				check = false;
        				break outloop;
        			}
        		}
        	}
        	if(check){
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
        	
        }
    }
}