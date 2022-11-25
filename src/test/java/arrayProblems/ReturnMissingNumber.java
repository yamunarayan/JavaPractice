package arrayProblems;

import java.util.Arrays;

public class ReturnMissingNumber {

    //Problem statement: Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array. Where n is the length of an array
    //Input: nums = [3,0,1,2,5]
    // Output: 4
    //constraint: Solve with o (n) time complexity

    public static void main(String[] args) {
        int[] input = {3, 0, 1, 2, 5};
        int n = input.length;
        System.out.println(missingNumberXOR(input, n));
        System.out.println(missingNumberUsingSum(input, n));
        System.out.println(missingNumberUsingBinarySearch(input, n));

    }

    public static int missingNumberUsingSum(int[] input, int n) {
        int sumOfArrayValues = n * (n + 1) / 2;
        for (int i = 0; i < n; i++)
            sumOfArrayValues -= input[i];
        return sumOfArrayValues;
    }
    //TC:O(n) and SC: O(1)

    public static int missingNumberXOR(int[] input, int n) {
        for (int i = 0; i < n; i++) {
            n ^= i;
            n ^= input[i];
        }
        return n;
        //TC:O(n) and SC: O(1)
    }

    public static int missingNumberUsingBinarySearch(int[] input, int n) {
        Arrays.sort(input);
        int left = 0, right = n, mid = left + right / 2;
        if (left < right) {
            mid = (left + right) / 2;
            if (input[mid] > mid) right = mid;
            else left = mid + 1;

            //TC:O(n) and SC: O(1)
        }
        return left;
    }
}