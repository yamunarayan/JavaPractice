package JBasics;

public class SumOfSeries {
    public static void main(String[] args){
       System.out.println( sum(4));
    }
    public static int sum(int n){
        return(n*(4*n*n+6*n-1)/3);
    }
}
