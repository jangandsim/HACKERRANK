package hackerrank;




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class third {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       
        long n = sc.nextLong();
        int  m = sc.nextInt();
        
        long [] list = new long [m];
        for(int i = 0; i < m ; i++)
        {   
            list [i] = sc.nextLong();
        }    
        if(recursion(n,false,list))
            System.out.println("First");
        else
            System.out.println("Second");
    }   
    
    // turn   first >>true   Second >>false
    
    public static boolean recursion(long n, boolean turn, long [] list)
    {           
                boolean what=false;
        if (n ==0 && turn == true){
            what = what|| true;
        }
        else if(n==1 && turn ==true){
                         what = what|| true;
        }
        else if(n==1 && turn ==false){
            what = false||what;
        }    
        else
        {
            for(long a : list)
            {
                if(n%a ==0)
                {
                    long coins = n/a; 
                    long piles = n/coins;
                 recursion(nimSum(coins, piles),!turn,list);        
                    
                }    
            }            
        }
        return what;    
    }    public static long nimSum(long coins, long piles)// second will do 
    {   
        if(piles ==1){
            return 1;
        }
       if(piles%2 ==0)
        {
          return 0;
       }
       else          /// odd xor is return same value if no 0  means second win
          return coins;
    }
     
}