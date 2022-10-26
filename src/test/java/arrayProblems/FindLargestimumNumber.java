package arrayProblems;

import org.testng.Assert;

//Problem statement :Given an array arr of size N, the task is to find the largest element in the given array.
//Example input: arr[] = {10, 20, 4}
//Example Output: 20
//Questions to ask: 1. Array is of what type, postitve element or negative number, what if array has same element,
// what if array has no element, what if array has one element, sorted or unsorted array

//Pseudo Code: check if the given array is empty ny getting the length; if the length is 0 return 0.
// Create temporary variable and name it as max with the same type of array and assign array 0th index position to max
//Create for loop and initialize i variable with 0, and iterate the for loop till the length by incrementing i by incrementing one after each iteration
//check if array of i is greater than max value; if yes assign array[i] to max, repeat the step using above-mentioned for loop
//return max value to find the largest number in an array
public class FindLargestimumNumber {
    public static void main(String[] args){
        int[] a= {10,20,4};
        int output=20;
        int n=a.length;
        int i=0;
        System.out.println("The largest number in an array is :" + linearTraversal(a));
        Assert.assertEquals(linearTraversal(a),output);
        System.out.println("The largest number in an array is :" + largestrecursiveMethod(a,n,i));
        Assert.assertEquals(largestrecursiveMethod(a,n,i),output);
       Assert.assertEquals(usingSort(a),output);
    }

    public static int linearTraversal(int[] a){
        if(a.length==0)
            return 0;
        int max=a[0];
        for(int i=0;i<a.length;i++){
                if(a[i]>max)
                    max=a[i];
        }
      return max;
    }
//Time Complexity: O(n) , Space Complexity : O(1)

    public static int largestrecursiveMethod(int [] a,int n, int i){
        if(i==n-1)
            return a[i];
        int rec=largestrecursiveMethod(a,n,i+1);
        return (rec >= a[i]) ? rec : a[i];

    }
    //Time Complexity: O(n) , Space Complexity : O(n)
    public static int usingSort(int[] a){
        int max;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    max=a[i];
                    a[i]=a[j];
                    a[j]=max;

                }
            }
        }
        return a[a.length-1];
    }
}
