package JBasics;

public class LCMOfTwoNumber {
    public static void main(String[] args){
    System.out.println("Lcm od two number is "+ lcm(15,20));
    }
    public static int gcd(int a, int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static int lcm(int a, int b){
        return(a/(gcd(a,b))*b);
    }
}
