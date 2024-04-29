package de.telran._29_04.homework;

import java.util.ArrayList;
import java.util.List;

public class MergeThreeSortedArrays {
    public static List<Integer> mergeThreeSortedArrays(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> mergedArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            int minVal = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
            mergedArray.add(minVal);

            if (minVal == arr1[i]) {
                i++;
            } else if (minVal == arr2[j]) {
                j++;
            } else {
                k++;
            }
        }

        while (i < arr1.length) {
            mergedArray.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            mergedArray.add(arr2[j]);
            j++;
        }
        while (k < arr3.length) {
            mergedArray.add(arr3[k]);
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 7, 11};
        int[] arr2 = {8, 12};
        int[] arr3 = {4, 9, 11};
        List<Integer> merged = mergeThreeSortedArrays(arr1, arr2, arr3);
        System.out.println(merged);
    }
}
