package hackerrank_YET;

import java.io.*;
import java.util.*;

public class SimplifiedChessEngine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int g = scan.nextInt();
        for(int i = 0; i < g; i++){
        	int w = scan.nextInt();
        	int b = scan.nextInt();
        	int m = scan.nextInt();
        	String[][] turn = new String[4][4];
        	for(int h = 0; h < 4; h++){
        		for(int n = 0; n < 4; n++){
        			turn[h][n] = "X";
        		}
        	}
        	for(int j = 0; j < w; j++){
        		String t = scan.next();
        		char c = scan.next().toCharArray()[0];
        		int r = scan.nextInt();
        		turn[c-'A'][r-1] = "W"+t;
        	}
        	for(int k = 0; k < b; k++){
        		String t = scan.next();
        		char c = scan.next().toCharArray()[0];
        		int r = scan.nextInt();
        		turn[c-'A'][r-1] = "B"+t;
        	}
        	if(whitewins(turn, "W", m)){
        		System.out.println("YES");
        	} else{
        		System.out.println("NO");
        	}
        }
    }
    static boolean whitewins(String[][] a,String b, int c){
    	if(c ==0){
    		return false;
    	}
    	if(checkmate(a, b)){
    		return true;
    	}
    	String b0 = "W";
    	if(b.equals("W")){
    		b0 = "B";
    	}
    	ArrayList<String[][]> k = nextmoves(a, b);
    	boolean check = false;
    	if(k == null){
    		return false;
    	}
    	for(String[][] j : k){
    		check = (check || whitewins(j, b0, c-1));
    		if(check){
    			return true;
    		}
    	}
    	return check;
    }
    static ArrayList<String[][]> nextmoves(String[][] a, String b){
		
    	
    	
    	return null;
    }
    static boolean checkmate(String[][] a, String b){
    	if(b.equals("B")){
    		return false;
    	}
    	for(int i = 0; i < 4; i++){
    		for(int j = 0; j < 4; j++){
    			if(a[i][j].contains("W")){
    				char c = a[i][j].charAt(1);
    				if(c-'Q' ==0 || c-'R' == 0){
    					int p = 1;
    					while(i+p < 4){
    						if(a[i+p][j].equals("BQ")){
    							return true;
    						}
    						if(!a[i+p][j].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(i-p >= 0){
    						if(a[i-p][j].equals("BQ")){
    							return true;
    						}
    						if(!a[i-p][j].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(j+p < 4){
    						if(a[i][j+p].equals("BQ")){
    							return true;
    						}
    						if(!a[i][j+p].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(j-p >= 0){
    						if(a[i][j-p].equals("BQ")){
    							return true;
    						}
    						if(!a[i][j-p].equals("X")){
    							break;
    						}
    						p++;
    					}
    				}
    				if(c-'Q' ==0 || c-'B' == 0){
    					int p = 1;
    					while(i+p < 4  && j + p <4){
    						if(a[i+p][j+p].equals("BQ")){
    							return true;
    						}
    						if(!a[i+p][j+p].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(i-p >= 0 && j-p >= 0){
    						if(a[i-p][j-p].equals("BQ")){
    							return true;
    						}
    						if(!a[i-p][j-p].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(j+p < 4 && i -p >= 0){
    						if(a[i-p][j+p].equals("BQ")){
    							return true;
    						}
    						if(!a[i-p][j+p].equals("X")){
    							break;
    						}
    						p++;
    					}
    					p = 1;
    					while(j-p >= 0 && i +p < 4){
    						if(a[i+p][j-p].equals("BQ")){
    							return true;
    						}
    						if(!a[i+p][j-p].equals("X")){
    							break;
    						}
    						p++;
    					}
    					if(c-'N' == 0){
    						int r = 2;
    						int q = 1;
    						if(i+r < 4 && j+q < 4 && a[i+r][j+q].equals("BQ")){
    							return true;
    						}
    						if(i+r < 4 && j-q >= 0 && a[i+r][j-q].equals("BQ")){
    							return true;
    						}
    						if(i-r >= 0 && j+q < 4 && a[i-r][j+q].equals("BQ")){
    							return true;
    						}
    						if(i-r >= 0 && j-q >= 0 && a[i-r][j-q].equals("BQ")){
    							return true;
    						}
    						if(i+q < 4 && j+r < 4 && a[i+q][j+r].equals("BQ")){
    							return true;
    						}
    						if(i-q >= 0 && j+r < 4 && a[i-q][j+r].equals("BQ")){
    							return true;
    						}
    						if(i+q < 4 && j-r >= 0 && a[i+q][j-r].equals("BQ")){
    							return true;
    						}
    						if(i-q >= 0 && j-r >= 0 && a[i-q][j-r].equals("BQ")){
    							return true;
    						}
    					}
    				}
    			}
    		}
    	}
    	return false;
    }
}











