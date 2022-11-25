package JBasics;

public class MaximumPieces {
    public static void main(String[] args){
System.out.println(findMaximumPiece(3));
    }
    public static int findMaximumPiece(int n){
        int x=n/2;
        return((x+1)*(n-x+1));
    }
}
