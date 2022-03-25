package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] startingArray = new int[] {19,5,34,81,17,22,6};
        for(int i:startingArray){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        Sort.mergeSort(startingArray);
        for(int i:startingArray){
            System.out.print(i + " ");
        }
    }
}
