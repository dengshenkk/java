import org.jetbrains.annotations.Contract;

import java.*;

public class array {
    public static void main(String[] args) {
        int arr[] = {12, 12, 12, 23, 34, 45, 56, 343, 6};
//        System.out.println(findMaxFromArray(arr));
//        System.out.println(findMinFromArray(arr));
        reverseArray(arr);
    }

    /**
     * 找出数组中的最大值
     * 找出数组中的最小值
     * 数组中的元素对调
     */
    public static int findMaxFromArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinFromArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] arr) {
        System.out.println("原数组顺序");
        for (int i : arr) {
            System.out.println(i);
        }
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = arr.length - 1; i > 0; i--, index++) {
            result[index] = arr[i];
        }
        System.out.println("新数组顺序");
        for (int i : result) {
            System.out.println(i);
        }
        return result;
    }
}
