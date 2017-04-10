package hackerrank_YET;
import java.io.*;
import java.util.*;

public class Equal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int[] people = new int[n];
            for(int j = 0; j < n; j++) {
                people[j] = scan.nextInt();
            }
            System.out.println(distributer(people));
        }
    }
    static int distributer(int[] a) {
        boolean check = true;
        for(int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                check = false;
                break;
            }
        }
        if(check) {
            return 0;
        }
        int min = 0;
        for(int i = 0; i < a.length; i++) {
            min = Math.min(distributer(adder(a, 1, i)), min);
            min = Math.min(distributer(adder(a, 2, i)), min);
            min = Math.min(distributer(adder(a, 5, i)), min);
        }
        
        return min+1;
    }
    static int[] adder(int[] a, int b, int c) {
        for(int i = 0; i < a.length; i++) {
            if (i != c) {
                a[i] += b;
            }
        }
        return a;
    }
}