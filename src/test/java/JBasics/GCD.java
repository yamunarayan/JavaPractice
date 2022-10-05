package JBasics;

public class GCD {
    public static void main(String[] args){
    System.out.println("Gcd of two number is "+ gcdNum(98,56));
    }
    public static int gcdNum(int a, int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==b)
            return a;
        if(a>b)
            return gcdNum(a-b,b);
        return gcdNum(b,b-a);
    }
}
