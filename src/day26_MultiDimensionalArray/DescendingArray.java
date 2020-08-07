package day26_MultiDimensionalArray;

import java.util.Arrays;

/*
1.  write a program that can sort the array in descending order
    ex:arr1: { 10, 11, 8, 9, 12, 5, 15};
    output:arr2: {15, 12, 11, 10, 9, 8, 5}
 */
public class DescendingArray {

    public static void main(String[] args) {

        int[] arr1={10,11,8,9,12,5,15};

        Arrays.sort(arr1);//[5, 8, 9, 10, 11, 12, 15]
        System.out.println(Arrays.toString(arr1));

        int []arr2= new int[arr1.length]; // {15,12,11,10,9,8,5}



        int j=arr1.length-1;
        for( int i=0;i<=arr1.length-1; i++){
            arr2[i] =arr1[j];

            j--;


        }
        System.out.println(Arrays.toString(arr2));
    }
}
