package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingtheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> k = new TreeSet<Integer>();
        for(int scores_i=0; scores_i < n; scores_i++){
            k.add(in.nextInt());
        }
        ArrayList<Integer> cc = new ArrayList<>(k);
        int g = cc.size();
        int t = 0;
        for(int alice_i=0; alice_i < m; alice_i++){
            int aq = in.nextInt();
            while(t < cc.size()){
            	if(aq < cc.get(t)){
            		break;
            	}
            	t++;
            	g--;
            }
            System.out.println(g);
        }
    }
}
