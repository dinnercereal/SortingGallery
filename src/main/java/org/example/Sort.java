package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to array with the numbers from smallest to largest.
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
        int i = 0;
        int aI1 = 0;
        int aI2 = 0;
        while((aI1<array1.length)&&(aI2<array2.length)){
            if(array1[aI1]<array2[aI2]){
                inputArray[i] = array1[aI1];
                aI1++;
            } else{
                inputArray[i] = array2[aI2];
                aI2++;
            }
            i++;
        }
        if(aI1>=array1.length){
            for(int j=aI2;j<array2.length;j++){
                inputArray[i]=array2[j];
                i++;
            }
        } else if(aI2>=array2.length){
            for(int j=aI1;j<array1.length;j++){
                inputArray[i]=array1[j];
                i++;
            }
        }
    }
    public static void mergeSort(int[] arr){
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
}
