package hackerrank_YET;
import java.io.*;
import java.util.*;

public class hackerrankcontest101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(cutting(a,b));
    }
    static int cutting(int a, int b){
        if(a == 1){
            return b-1;
        }
        if(b == 1){
            return a-1;
        }
        int n = a;
        int m = b;
        for(int i = 2; i < a/2; i++){
            if(a%i == 0){
                n = i;
                break;
            }
        }
        for(int j = 2; j < b/2; j++){
            if(b%j == 0){
                m = j;
                break;
            }
        }
        return m*n-1+ cutting(a/n, b/m);
    }
}