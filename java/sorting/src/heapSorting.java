import java.util.Arrays;

public class heapSorting implements  sort{
    @Override
    public void sort(int[] arr) {
        int[] result = heapSort(arr,arr.length);
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int[] arr = {1,9,8,2,4,0,3,7,6};
        heapSorting test = new heapSorting();
        test.sort(arr);
    }

    public int[] downAdjust(int[] arr,int parent,int length){
        int temp = arr[parent];
        int child = 2 * parent + 1;
        while(child < length){
            if(child + 1 < length && arr[child] > arr[child + 1]) child++;
            if(temp < arr[child]) break;
            arr[parent] = arr[child];
            parent = child;
            child = 2 * parent + 1;
        }
        arr[parent] = temp;
        return  arr;
    }


    public int[] heapSort(int[] arr,int length){
        // 从最中间开始，向下调整，如果该数字比后代的要大，那就向下调整~
        for(int i = (arr.length - 2) / 2; i >= 0; i--){
            arr= downAdjust(arr,i,length);
        }
// 我们只需要求第 K 个数字就好了
//        TOP k 的问题，我们就可以使用该方法
//        同时，如果是超大的文本，选取TOP 10
//        我们可以用二叉搜索树，用字符本身来作为 key，用出现的次数来代替value
//        每次遇到一个字符的时候，先查询该字符在树中是否存在，如果存在， value + 1，并且将value 和优先队列中的值进行比较
//        看谁否能加入优先队列中去
        for(int i = length - 1; i >= 1; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            arr = downAdjust(arr,0,i);
        }
        return  arr;
    }
}

// 我们进行堆排序，在堆排序之前，我们需要先创建一个最大堆，或者是最小堆
// 在进行建堆的时候，我们是先放置好之后，然后进行上浮的操作，
// 我们创建一个最小堆，就说明所有的子节点都比自己的父节点要大
// 从最后一个开始上浮，如果父节点比自己大，那就自己上浮上去
// 上浮的时候，我们只需要上浮一半就可以了
// 堆排序是 nlogn，不会受到数据特征的影响 ，他是不稳定的
// 求第K 个最大值