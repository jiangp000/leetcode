import java.util.Arrays;

public class chooseSorting implements sort{
    @Override
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++){
            int min = i;
            for(int j = i + 1; j < arr.length; j ++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,8,3,0,9,6,7};
        sort test = new chooseSorting();
        test.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// 选择排序也是不稳定的，5 3 5 4 2
// 第一个 5，会被换到 2的后边来

//冒泡排序是稳定的
//插入排序也是稳定的
//归并排序也是稳定的
//快排是不稳定的
//堆排序也是稳定的

