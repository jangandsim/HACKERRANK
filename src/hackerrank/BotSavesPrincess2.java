package hackerrank;

import java.io.*;
import java.util.*;

public class BotSavesPrincess2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] me = {-1, -1};
        int[] pr = {-1, -1};
        int a = scan.nextInt();
        int r = scan.nextInt();
        int c = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < a; i++){
            char[] b = scan.nextLine().toCharArray();
            for(int j = 0; j < a; j++){
                if(b[j] - 'p' == 0){
                    pr[0] = i;
                    pr[1] = j;
                }
                if(b[j] - 'm' == 0){
                    me[0] = i;
                    me[1] = j;
                }
            }
        }
        int x = pr[0] - me[0];
        int y = pr[1] - me[1];
        if(x > 0){
            System.out.println("DOWN");
              
        } else if(x < 0){
            System.out.println("UP");
        } else{
                System.out.println("RIGHT");
            } else if(y < 0){
                System.out.println("LEFT");
            } 
        }
    }
}