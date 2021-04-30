public class insetSort {
    public void insertSorting(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && temp < arr[k]) k--;
            for (int j = i; j > k + 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[k + 1] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 5,0,2,3,4};
        new insetSort().insertSorting(arr);
        System.gc();
    }
}
