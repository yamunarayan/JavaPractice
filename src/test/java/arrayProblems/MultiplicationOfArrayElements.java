package arrayProblems;

import org.testng.Assert;

//Problem statement: We are given an array, and we have to calculate the product of an array using both iterative and recursive methods.
//Sample input : array[] = {1, 2, 3, 4, 5, 6}
//Sample Output : 720
//Here, product of elements = 1*2*3*4*5*6 = 720
//Question to be asked: what if array is empty; when it has only one element, what if it has negative numbers, what should be return if it has 0 or 1.
//Pseudo code: Create an array with the given type and initialize array with the value
//Check array has elements; if it has no element return 0
//If the array length is 1 retrun array[0]
//if the array length is greater than 1; create for loop and initalize i=0;and iterater till its length
// create an temporary variable mul amd multiple value is index for each iteration
//return mul
public class MultiplicationOfArrayElements {
    public static void main(String[] args){
        int array[] = {1, 2, 3, 4, 5, 6};
        int n = array.length;
        int output = 720;
        Assert.assertEquals(usingTemporaryVariable(array,n),output);
        System.out.println("Product of an array element is : "+ usingTemporaryVariable(array,n));
        Assert.assertEquals(usingRecursive(array,n),output);
        System.out.println("Product of an array element using recursive : "+ usingRecursive(array,n));

    }
    public static int usingTemporaryVariable(int array[], int n){
        if(n==0)
            return 0;
        if(n==1)
            return array[0];
        int mull=1;
        for(int i=0;i<n;i++){
            mull =mull * array[i];
        }
    return mull;
    }
    //Time Complexity : O(n) and space complexity O(1)
    public static int usingRecursive(int array[], int n){
        if(n==0)
            return 0;
        if(n==1)
            return array[0];
        int recmull=usingRecursive(array,n-1)*array[n-1];
        return recmull;
    }
    //Time Complexity : O(n) and space complexity O(1)
}
