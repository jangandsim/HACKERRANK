package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if(grade > 37){
                int next = ((grade/5)+1)*5;
                if(next - grade < 3){
                    grade = next;
                }
            }
            System.out.println(grade);
        }
    }
}
