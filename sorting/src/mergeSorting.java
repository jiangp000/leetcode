import java.util.Arrays;

public class mergeSorting implements sort{
    @Override
    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length - 1,temp);
    }
    public void mergeSort(int[] arr, int begin, int end, int[] temp){
        if(begin < end){
            int middle =  (end + begin) / 2;
            mergeSort(arr,begin,middle,temp);
            mergeSort(arr,middle + 1,end,temp);
            merge(arr,begin,middle,end,temp);
//            System.out.println(Arrays.toString(temp));
        }
    }
    public void merge(int[] arr, int begin, int middle, int end, int[] temp){
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(temp));
        int i = begin, j = middle + 1, k = 0;
        while(i <= middle && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= middle) temp[k++] = arr[i++];
        while(j <= end)    temp[k++] = arr[j++];
        k = 0;
        while(begin <= end ){
            arr[ begin ++] = temp[k ++];
        }
    }

    public static void main(String[] args) {
        sort test = new mergeSorting();
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        test.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
