package MyQuick;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,4,9,0,19,23};
        QuickSort(0,arr.length - 1,arr);
        for(int i : arr){
            System.out.print(i+"   ");
        }

    }
    public static void QuickSort(int start, int end, int[] arr){
        if(start < end){
            int middle = quicksort(start,end,arr);
            QuickSort(start,middle - 1,arr);
            QuickSort(middle + 1,arr.length - 1,arr);
        }
    }

    public static int quicksort(int start, int end, int[] arr){
        int temp = arr[end];
        while(start < end){
            while(start < end && arr[start] <= temp){
                start ++;
            }
            if(start < end){
                arr[end] = arr[start];
                end--;
            }
            while(start < end && arr[end] > temp){
                end --;
            }
            if(start < end){
                arr[start] = arr[end];
                start ++;
            }
        }
        arr[start] = temp;
        System.out.println(start);
        return start;
    }
}
