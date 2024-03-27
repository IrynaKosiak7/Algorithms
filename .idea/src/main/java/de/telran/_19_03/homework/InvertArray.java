package de.telran._19_03.homework;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int[] array = new int[]{};
        System.out.println(Arrays.toString(invertArray(array)));
        int[] array2 = new int[]{5, 7, 8, 10, 12, 13, 18};
        System.out.println(Arrays.toString(invertArray(array2)));

    }

        public static int[] invertArray(int[] inputArray) {
            int temp;
            for (int i = 0; i < inputArray.length / 2; i++) {
                if (inputArray.length == 0) {
                    return new int[] {0, 0};
                } else {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[inputArray.length - 1 - i];
                    inputArray[inputArray.length - 1 - i] = temp;
                }
            }
            return inputArray;
            // The computational complexity of this algorithm is O(n/2).
        }

}
