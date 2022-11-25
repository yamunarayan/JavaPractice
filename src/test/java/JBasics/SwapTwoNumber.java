package JBasics;

public class SwapTwoNumber {
    public static void main(String args[]) {
        int x=9;
        int y=8;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
        //Time Complexity: O(1)

        //Auxiliary Space: O(1), since no extra space has been taken.

    }
}
