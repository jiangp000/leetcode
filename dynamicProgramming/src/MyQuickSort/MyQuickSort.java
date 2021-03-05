package MyQuickSort;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,2,9,0,17};
        QuickSort(arr,0,arr.length - 1);
        for(int i :arr){
            System.out.print(i+"  ");
        }
    }
    public static void QuickSort(int[] arr, int start, int end){
        if(start < end){
            int standard =quickort(arr,start,end);
            QuickSort(arr,start,standard - 1);
            QuickSort(arr,standard + 1,end);
        }
    }
    public static int quickort(int[] arr, int start, int end){
        int temp =arr[end];
        while(start < end){
            while( start <end && arr[start] <= temp){
                start++;
            }
            if(start < end){
                arr[end] = arr[start];
                end --;
            }
            while(start < end && arr[end] > temp){
                end--;
            }
            if(start < end){
                arr[start] = arr[end];
                start ++;
            }
        }
        arr[start] = temp;
        return start;
    }
}
