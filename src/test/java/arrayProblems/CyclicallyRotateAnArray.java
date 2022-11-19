package arrayProblems;

//Problem statement: Given an array, cyclically rotate the array clockwise by one.
//Example Input:  arr[] = {1, 2, 3, 4, 5}
//Example Output: arr[] = {5, 1, 2, 3, 4}

import org.testng.Assert;

import java.util.Arrays;

//Questions to be asked: whats should be written if the array length is 0;and it has one element , if it has same element
/*
Pseudo code: Get the length of the array; if the array length is o return empty array
If the array length is 1 return array[0]
if the array length is greater than 1 ; get the first element and store it in temporary variable and move the rest of the element to
one step ahead and store the variable value in n-1 position
* */
public class CyclicallyRotateAnArray {
    public static void main(String[] args){
int input[] = {1, 2, 3, 4, 5};
int output[] = {5, 1, 2, 3, 4};
       Assert.assertEquals(rotate(input),output);
        Assert.assertEquals(cycleArr(input),output);
    }

    public static int[] rotate(int[] input){
        int i=0,j=input[input.length-1];
        while(i != j)
        {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
        }
        return input;
    }
    public static int[] cycleArr(int[] input){
        int lastElement=0;
        if(input.length==0| input.length==1)
            return input;
        lastElement=input[input.length-1];
        for(int i=input.length-1;i>0;i--)
            input[i]=input[i-1];
            input[0]=lastElement;
        return input;
    }
    //Time complexity:O(n); space complexity : O(n)`

}
