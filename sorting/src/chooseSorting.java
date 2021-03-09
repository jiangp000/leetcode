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
