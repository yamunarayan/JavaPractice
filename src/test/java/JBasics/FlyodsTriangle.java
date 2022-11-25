package JBasics;

import org.testng.annotations.Test;

public class FlyodsTriangle {
    public static void main(String[] args){
        printTriangle(6);
    }
    public static void printTriangle(int n){
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(val +" ");
                val++;
            }
            System.out.println();
        }
    }

}
