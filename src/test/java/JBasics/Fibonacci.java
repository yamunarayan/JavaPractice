package JBasics;

public class Fibonacci {
    public static void main(String[] args){
        int n=7;
        for(int i=0;i<n;i++){
            System.out.println(fib(i));
        }
       fibOne(n);

    }

    public static int fib(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
         else{
             return fib(n-2)+fib(n-1);

        }

    }
public static void fibOne(int n){
        int i,f1=0,f2=1;
        if(n<0)
            return;
        System.out.println(f1);
        for(i=1;i<n;i++){
            System.out.println(f2);
            int next=f1+f2;
            f1=f2;
            f2=next;
        }
}

}
