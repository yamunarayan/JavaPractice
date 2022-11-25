package arrayProblems;

import org.testng.Assert;

public class SumOfElementsInArray {
    //Problem statement: Given an array of integers, find sum of its elements.
    //Sample Input : arr[] = {1, 2, 3}
    //Sample Output : 6
    //Explanation: 1 + 2 + 3 = 6
    //Questions to be asked: - Array is of what type, positive elements or negative elements ; what should written if array is empty,
    //what to written if array has single element

    //Pseudo Code: create an array of mentioned type and length with the initialized value
    //Check whether the given array is empty if its empty return 0
    //Check the length of the array; if the length is equal to 1 return the array index 0 value
        // if the length is greater than 1 create an for loop to iterate the array value till its last index using array.length
    // get the array value using index and add that to temporary variable calleed sum and repeat the process.
    // return the sum.
    public static void main(String[] args){
        int arr[] = {1, 2, 3};
        int n= arr.length;
        int output = 6;
        Assert.assertEquals(usingTemporaryVariable(arr,n),output);
        System.out.println("Sum of array using temporary variable :"+usingTemporaryVariable(arr,n));
        Assert.assertEquals(usingRecursive(arr,n),output);
        System.out.println("Sum of array using recursive:"+usingRecursive(arr,n));
    }

    public static int usingTemporaryVariable(int arr[], int n){
        if(arr==null)
            return 0;
        if(n==1)
            return arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //Time Complexity : O(n); Space Complexity : O(1)

    public static int usingRecursive(int arr[], int n){
        if(n==0)
            return 0;
        if(n==1)
            return arr[0];
        int rec=usingRecursive(arr,n-1)+arr[n-1];
        return rec;
    }
    //Time Complexity : O(n); Space Complexity : O(1)
}
