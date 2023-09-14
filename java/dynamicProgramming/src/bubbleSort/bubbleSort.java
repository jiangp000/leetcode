package bubbleSort;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,9,10};
        questionOne test = new questionOne();
        System.out.println(test.binary_search(arr, 9));
//        for(int i : arr){
//            System.out.println(i + " ");
//        }
    }
}
class questionOne {
    public int binary_search(int[] arr, int val) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (val > arr[middle]) start = middle + 1;
            else if (val == arr[middle]) return middle;
            else {
                end = middle - 1;
            }
        }
        return start;
    }
}