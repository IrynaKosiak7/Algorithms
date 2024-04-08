package de.telran._07_04_homework;

public class BinarySearch {
    public static int find(int[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int x, int start, int end) {
        if (start > end) {
            return -1;
        }
        int midddle = (start + end) / 2;
        if (arr[midddle] == x) {
            return midddle;
        } else if (arr[midddle] < x) {
            return binarySearch(arr, x, midddle + 1, end);
        } else {
            return binarySearch(arr, x, start, midddle - 1);
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x1 = 114;
        System.out.println(find(arr1, x1));

        int[] arr2 = {1, 24, 30, 46, 60, 100, 120, 133, 270};
        int x2 = 114;
        System.out.println(find(arr2, x2));
    }
}
