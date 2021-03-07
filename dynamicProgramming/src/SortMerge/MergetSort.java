package SortMerge;


import java.util.Arrays;

public class MergetSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[arr.length];  //归并排序需要一个额外空间

        System.out.println("归并排序前 : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println("归并排序后 : " + Arrays.toString(arr));
    }

    //分+合方法
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            //向左进行递归分解
            mergeSort(arr, left, mid, temp);
            //向左进行递归分解
            mergeSort(arr, mid + 1, right, temp);

            //合并
            merge(arr, left, mid, right, temp);


        }
    }
    //合并的方法

    /**
     * @param arr   排序的原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  做中转的数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;  //初始化i,左边有序序列的初始索引
        int j = mid + 1;  //初始化j，右边有序序列的初始索引
        int t = 0;  //指向temp数组的当前索引

        //一、
        //先把左右两边（有序）的数据按照规则填充到temp数组
        //直到左右两边的有序序列，有一边处理完毕为止
        while (i <= mid && j <= right) {
            //如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
            //即将左边的当前元素，拷贝到temp数组
            //然后i++，t++
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                i++;
                t++;
            } else  //反之右边的小于左边的当前元素
            {
                temp[t] = arr[j];
                j++;
                t++;
            }
        }

        //二、把有剩余数据的一边的数据一次全部填充到temp
        while (i <= mid)  //左边有剩余
        {
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right)  //右边有剩余
        {
            temp[t] = arr[j];
            j++;
            t++;
        }

        //三、将temp的数据拷贝到arr
        //注意：并不是每一次都拷贝所有
        t = 0;
        int tempLeft = left;
//		System.out.println("tempLeft : " + tempLeft + "---right : " + right);
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}