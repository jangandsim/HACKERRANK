package hackerrank;

import java.io.*;
import java.util.*;

public class BotClean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] pr = {-1, -1};
        int[] prt = {10, 10};
        int[] me = new int[2];
        me[0] = scan.nextInt();
        me[1] = scan.nextInt();
        scan.nextLine();
        int mind = 11;
        for(int i = 0; i < 5; i++){
            char[] b = scan.nextLine().toCharArray();
            for(int j = 0; j < 5; j++){
                if(b[j] - 'd' == 0){
                    pr[0] = i;
                    pr[1] = j;
                    if(Math.abs(pr[0] - me[0]) + Math.abs(pr[1] - me[1]) < mind){
                        prt[0] = pr[0];
                        prt[1] = pr[1];
                    }
                }
            }
        }
        int x = prt[0] - me[0];
        int y = prt[1] - me[1];
        if(y > 0){
            System.out.println("RIGHT");
        } else if(y < 0){
            System.out.println("LEFT");
        } else{
            if(x > 0){
                System.out.println("DOWN");
            } else if(x < 0){
                System.out.println("UP");
            } else {
                System.out.println("CLEAN");
            }
        }
    }
}