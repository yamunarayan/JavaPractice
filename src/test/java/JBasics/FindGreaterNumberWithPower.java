package JBasics;

public class FindGreaterNumberWithPower {
    public static void main(String[] args){
        greaterNumber(12,24,5);
    }


    public static void greaterNumber(int a, int b, int n){
       if(!((n&1)>0)){
           a=Math.abs(a);
           b=Math.abs(b);
       }
        if(a==b){
            System.out.println("a^n is equal to b^n");
        }
       else if(a>b){
            System.out.println("a^n is greater than b^n");
        }
       else{
            System.out.println("a^n is lesser than b^n");
        }
    }
}
