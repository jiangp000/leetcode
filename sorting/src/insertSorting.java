import java.util.Arrays;

public class insertSorting implements sort {
    @Override
    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i ++){
            int temp = arr[i];
            int k = i - 1;
            while(k >=0 && temp < arr[k]) k --;

            for(int j = i; j > k + 1; j --){
                arr[j] = arr[j - 1];
            }
            arr[k + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,6,9,0,2,4,7,3,8};
        sort test = new insertSorting();
        test.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
