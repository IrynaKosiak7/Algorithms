package de.telran._19_03.homework;

import java.lang.reflect.Array;

public class SortArray {
    public static void main(String[] args) {
        int[] sorAr = new int[]{5, 7, 10, 10, 12, 18, 18};
        System.out.println(hasDuplicateElem(sorAr));
        int[] array = new int[]{5, 7, 8, 10, 12, 13, 18};
        System.out.println(hasDuplicateElem(array));
    }
    public static boolean hasDuplicateElem(int[] sortArray) {
        for (int i = 0; i < sortArray.length - 1; i++) {
            if (sortArray[i] == sortArray[i + 1]) {
                return true;
            }
        }
        return false;
    }
//    The computational complexity of this algorithm is O(n).
}
