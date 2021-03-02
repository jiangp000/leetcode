# leetcode
记录自己leetocde的过程



## 2021.1.31
-  496 Next Greater Element I
- 复习了 linkedlist，arraylist的区别    
## 2021.2.1
- 198 House Robber
- 学会了数组的创建，以及动态规划最基本的题目    
## 2021.2.2 
- 322 兑换钱币
- 学会了 Arrays.fill 的使用，以及查看源码，返回
- 记录在哔哩哔哩 中
## 2021.2.3
- 53 最大子数字之和
- 先更新max，再将负数赋值为0 
- 62 不同的路径 
- arr[0][0] 到arr[m][n]  只能向下，向右 一共有多少种方法
- m n 和n m 是对称的，并且 n=1 直接就是1 n=2 有m中方法 n=3 有1+2+3+m中方法 其他 有arr[m-1][n] +arr[m][n-1]中方法
## 2021.2.4
-  70 Climbing Stairs 
- 相当于斐波拉契数列  
- 用时间换空间
-  264 Ugly Number II
- 三指针  2 3 5  
## 2021.2.5
-  105 ConstructBinaryTreefromPreorderandInorderTraversal
- 知道前序  和中序 求树
## 2021.2.6
- 905. Sort Array By Parity
- 偶数放前面 奇数放后面  傻瓜题
- 922  SortArrayByParityII
- 偶数放偶数位，奇数放奇数位 傻瓜题 
- 98 ValidateBinarySearchTree98
- 中序结果看是否为升序   傻瓜题目
**全局变量或者是静态变量需要自己手动的进行初始化**
- 107 Binary Tree Level Order Traversal II
-  Collesctions.reverse() queue.remove() queue.poll()(唯一的区别 remove 抛异常 poll 是null)
- 和102题  一模一样 
- 维持 before 和 after 两个数组，一层一层的进行搜索  

## 2021.2.9
- 671  二叉树中第二小的节点
- Collections.max  collections.min() 方法的使用
- 面试题04.04. 检查平衡性 
- 606  根据二叉树创建字符串
- 按照题目的意思写出递归表达式 即可 傻瓜题
- 617. Merge Two Binary Trees
- JS 五行代码解决问题  if(t1 && t2)  return t1 || t2     
- 669 TrimaBinarySearchTree 
- 傻瓜题目 

## 2021.2.12
- 56 MergeIntervals
- 合并数组  [1,4] [2,3] 如何判断这两个区间的数字是包含在一起的
- 只要数字 在另外一个区间中，那么就是包含在一起的
## 2021.2.13
- 75 SortColors
- 使用了Arrays.sort()
- 148 SortList
- 将链表进行排序，自己使用快排，但是没有成功，查看sort源码。
- 如果不是很有序，就使用快排，之后会在基数排序和归并排序中进行选择使用
- 自己使用JaVA 中arrays.sort() 没有自己实现归并排序
- 147 对链表进行插入排序
- 自己没有使用插入排序 使用快排     

## 2021.2.14
- KMP 算法，待续
## 2021.2.15
- 57 插入区间，再排序 和56题是一样的
- 学习到了二维数组的排序 以及 自定义数组排序
```        int[][] result={{1,4,5,2},{2,5,76},{1,3,6},{7,8,9},{10,3}};
        Arrays.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });```
## 2021.2.16
- 28 KMP 算法
- 242 判断两个字符串是否为字谜
- 我们排序之后 比较是否相等就可以 学到了 t.toCharArray()  数组比较相等 Arrays.equal(s1,s2)
- 220 一个字符串中两个索引 i j 绝对值小于 t num[i],num[j] 绝对值小于 k
- 暴力搜索会超时，我们使用 treeset，维持一个k的滑动窗口，在set中 调用floor(num[i]) 和 ceiling(num[i])
- 179 组成最大的数字
//        数字转化为 String 一共有三种方法
//        1： 3 +“”，这个效率是最低的，不推荐使用
//        2： String.valueOf(t) ,当 t 为null的时候，结果也是“null”
//        3： t.toString() 当t为null的时候，会抛出 nullpointerexception
- 274 HINDEX 指数
- 先排序，看最大的数字有几个 [len - i -1 ] > i {i++} 
- hashmap的排序，直接对key进行排序就可以，之后再用get方法访问
- List<Interger> result = new ArrayList<>(hashmap.keyset)

## 2021.2.17
- 349 两个数组的交集
- 我们使用 Set
- 先排序，然后如果相等，就加入数组 
- list 转为 数组[]   result.stream().mapToInt(Integer::intValue).toArray()
- 350  两个数组的交集
- 我们使用arraylist

## 2021.2.18
- 976 周长最大的三角形
- 先排序，然后从大到小排列

## 2021.2.19 
- 704 二分法查找
while(i <= j) 

## 2021.2.20
- 12题，将数字转化为罗马数字
- 软编码的形式，进行除 和 减 （对应）
- 13题，罗马正数转为数字
- 用hashmap 的 contains （分为两个和一个的）
- 69题 开平方根 

```java
        int answer = (int) Math.exp(0.5 * Math.log(x));
        return  (long) (answer + 1) * (answer + 1) <= x ? answer + 1 : answer;
```
- 50题目，POW（x，n）
-  使用了快速幂的方法
- 67 二进制的加法
- 使用了 Stringbuilder 的reverse，append 和tostring方法 
- Stringbuilder 和Streingbuffer的 区别
1 ：stringbuffer 是线程安全的，因为他被synochized 修饰，而builder 是不安全的
2 ：缓冲区，buffer 是从缓冲区中的toStringcache构造一个，而builder 是直接赋值一个数组
3 ：性能，很显然，builder没有同步方法，所以性能会更好一点   
  
## 2021.2.21
- 126 单个数字 使用异或运算 
- 46 全排列  
```java
        for(int i = first; i < N; i++){
            Collections.swap(temp,i,first);
            backTrace(N,temp,result,first + 1);
            Collections.swap(temp,i,first);
        }
```

- 169题目 将数字转化为AZ
701 是 ZY，由于这里的 0 是由26 代替，所以我们先除以1，再进行计算 
  
## 2021.2.22
47. Permutations II  全排列中允许相同的数组

## 2021.2.25
- 291 Nim游戏 每次取三个，两个和一个 
- 只要是 4 的倍数，那么就必输，否则就肯定能赢
- 第K 个数 剑指offer
- 703题目，第K个最大的数字
- 学到了数组的copy，System.arraycopt(原数组，开始，拷贝的数组，开始的数组，数组的长度）

## 2021.2.26
- 1046 碎石头，把最大的两个，相减，放在数组中，最后得到最后的一个元素

## 2021.2.27
- 622 设计循环队列
- 209 子数组和大于K 的最少元素个数 滑动窗口
- 维持一个数组，如果大于K，就减去第一个
- hannuota

## 2021.2.28
- 剑指 Offer 59 - I. 滑动窗口的最大值
- 滑动窗口 

## 2021.3.1
- 剑指 Offer 59 - II. 队列的最大值
- 用一个list当作队列，每次插入的时候，就计算出最大的数值
- 【我的时间复杂度没满足条件】  
- 面试题 17.18. 最短超串
- 用hashmap来存储要判断的，如果包含，就将1 设置为0，看len == size，说明已经全部包含了
- 当移动的时候，如果最前面的那个是要的元素，此时不能判断后边的元素有没有它，所以只能从前面重新开始
- 【更正的时候】，我们有一次，就减一次，这样就知道后面有美誉哦

## 2021.3.2
- 76题目的最小覆盖字串，没有考虑到字串是 aaa含有相同字符的情况
- 【没有做出来】
- 滑动窗口的题目都好难，我一个都不会了