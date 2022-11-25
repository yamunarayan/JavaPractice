package JBasics;

import org.testng.annotations.Test;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Area of factorial is "+ fact(4));
        System.out.println("Area of factorial is "+ fact1(4));
        System.out.println("Area of factorial is "+ fact2(4));
        System.out.println("Area of factorial is "+ fact3(4));
    }
    @Test
    public static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
            }
@Test
    public static int fact1(int n)    {
       int res=1,i;
       for(i=2;i<=n;i++)
           res*=i;
           return res;
          }
    public static int fact2(int n){
        int i=n,fact=1;
        while(n/i!=n){
            fact=fact*i;
            i--;
        }
        return fact;
          }
    public static int fact3(int n){
        return(n==0|n==1)? 1: n*fact3(n-1);
    }
}
