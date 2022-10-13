package arrayProblems;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllOccurancesOfTargetElement {
    //Problem statement: Given an integer array and a target value k, remove all the occurrences of the target
     //element and return the array
    //Eg input: int[]arr={1,2,3,4,5,5,6}, k=5
    //Output: {1,2,3,4,6}
    //Constraints: Solve using additional space initially and optimise it to O(1) space
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 6};
        int[] output = remove(a, 5);
        Assert.assertEquals(new int[]{1,2,3,4,6},output);
                System.out.println("output : " + Arrays.toString(output));

        System.out.println("output : " + Arrays.toString(removeUsingStream(a,5)));
        System.out.println("output : " + Arrays.toString(removeUsingArrayList(a,5)));
    }

    public static int[] remove(int[] input, int element) {
        int count = 0;
        for(int number:input){
            if(number==element){
                count++;
            }
        }
        if(count==0){
            return input;
        }
        int[] result = new int[input.length-count];
        int index=0;
        for(int value:input){
            if(value!=element){
                result[index]=value;
                index++;
            }
        }
        input=null;
        return result;

    }

    //Using Stream
    public static int[] removeUsingStream(int[] input, int element){
        return Arrays.stream(input).filter(value -> value!=element).toArray();
    }

    //Using ArrayList
    public static int[] removeUsingArrayList(int[] input, int element) {
    List<Integer> result = new ArrayList<Integer>();

    for(int i:input){
        if(i!=element)
            result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }




}