package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to array with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
        int temp;
        if(nums[0] > nums[1]){
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<inputArray.length;i++){
            if(!(index1==array1.length)&&!(index2==array2.length)){
                if(array1[index1]<array2[index2]){
                    inputArray[i] = array1[index1];
                    index1++;
                } else if(array2[index2]<array1[index1]){
                    inputArray[i] = array2[index2];
                    index2++;
                }
            }
        }
    }
}
