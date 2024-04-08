package de.telran._07_04_homework;

public class MaxElement {
    public static int getMaxNumber(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 2, 15, 14, 27};
        System.out.println(getMaxNumber(arr));
        System.out.println(findMax(arr, 0, 0));

    }

    public static int findMax(int[] array, int index, int max) {
        if (index == array.length) {
            return max;
        } else {
            if (array[index] > max) {
                max = array[index];
            }
            return findMax(array, index + 1, max);
        }
    }
}