package hackerrank;

import java.io.*;
import java.util.*;

public class BabyStepGiantStep {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int d = scan.nextInt();
            if(d == 0){
                System.out.println(0);
            } else if(d == a || d == b){
                System.out.println(1);
            } else{
                int out = d/b;
                if(d%b != 0){
                    out++;
                }
                if(out == 1){
                    out++;
                }
                System.out.println(out);
            }
        }
    }
}