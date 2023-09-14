package SortMerge;

import java.util.Arrays;

public class SortMerge {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 9, 3, 5, 6, 2};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle, temp);
            mergeSort(arr, middle + 1, right, temp);
            merge(arr, left, middle, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right, int[] temp) {
        int i = left, j = middle + 1, res = 0;
        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[res++] = arr[i++];
            } else {
                temp[res++] = arr[j++];
            }
        }

        while (i <= middle) {
            temp[res++] = arr[i++];
        }
        while (j <= right) {
            temp[res++] = arr[j++];
        }
        res = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft++] = temp[res++];
        }

        System.out.println(Arrays.toString(temp));


    }
}
