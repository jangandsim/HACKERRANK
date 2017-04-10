package hackerrank;

import java.util.Scanner;

public class Person {

        public static void main (String[] args ) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++){
                int age = sc.nextInt();
                if (age < 0) {
                    System.out.println("Age is not valid, setting age to 0");
                    age = 0;
                }
                String j = amIold(age);
                System.out.println(j);
                
             for (i = 0; i < 3; i++)
                 
            }
            
                
        }
        
}
