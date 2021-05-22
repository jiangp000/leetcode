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
- 【3.3号接着来做】
- 使用单调队列，如果有可能成为最大值，就当在队列中，每次进行选择
- 在循环的过程当中
- 当myqueue不为空，并且轮到的元素和队列头部的元素之间距离大于等于 k，那么这个数字就应该被poll（具体太远）
- 当myqueue不为空，并且轮到的元素比队列尾部的元素大的话，那么就能够替换掉这些小数字的
- 然后把当前的 i 加进去，
- i >= k - 1，也就是产生结果的时候开始，每次把myqueue队列头部的元素取出来，放在结果集合中 
- 当轮到某一个元素的时候，说明他的舞台，已经来了~  
-1 -2 -3 -4 -5 -6 -7  这种情况元素被清除掉，是因为他们的距离大于 K 
- 学到了 dequeue和prorityqueue的 简单使用   
 1 2 3 4 5 6 7  

## 2021.3.3
- 剑指 Offer 48. 最长不含重复字符的子字符串 
- 最长不重复的字符串，使用hashmap来保存当前所在的位置
- 1423. 可获得的最大点数
- 把他转换为 滑动窗口的最小数值     


## 2021.3.14
- 1711 题目
-  res %=  (1e9 +7); 
-  res = res % ( 1e9 +7 )
- 这两种情况，有什么区别  
- 1750 删除两个字符串后面相同的字符
- 面试题目：0204，分割链表，创建一个大的，一个小的就可以了
- 让链表的第一个数字为0，好为下面进行赋值

## 2021.3.18
- 第一个题目还没有做出来，明天接着看吧，自己有多菜，！！！！ 925 
- 第二个题目是归并两个有序的数组，傻瓜题目
- 第三个题目是在出现一次的数字里面，**找出一个出现两次的数字~~  这个题目还不是很理解**
- 自己到底有多菜啊~~~


## 2021.3.19 
- 345 题目反转元音字母，使用到了 String.toLowerCase()
- 283 移动0，每次遇到一个0，说明后面非0的数字需要多移动一下
- 86 分割链表，使用到了大和小两个链表，注意第一个节点设置为0 
- 80 删除排序数组中的重复项，要么是1，要么是2，如果是2，那就把快指针一直往前跑，直到不相等
- 27 移动元素，就地移除所有数值 为 val的，


## 2021.3.20
- 今天来看 depth first search，深度优先遍历
- 二叉树的最小深度，这个使用递归找深度，如何描述出叶子节点
- 二叉树展开为链表，先前序遍历，然后再构建，没理解
- 相同的树，完全相同就相同，否则就不相同
- 电话号码的组合，XXXX,XXXX的组合问题，for循环加递归搞定
- 二叉树的前序遍历，非递归，先右边，再左边


## 2021.3.21
- 树的层次遍历一共有三道题目，从右边看，还有每一层的简历next指针
- 树的层次遍历使用 queue，remove 和 add方法
- 树的路径总和，本质上也是要先要找到叶节点~  然后进行左右的判断，进行递归  
- “” +“ ”，前面也是结果，它分割的结果就是空
- 二叉树的所有路劲，也是要到叶子节点，进行判断
- 自己真的好菜啊~~ 菜到家了···

## 2021.3.22
- 今天来看breadth first search，广度优先搜索
- 279题目，不会做，据说和兑换硬币是同一个题目
- 将十进制转换为二进制，求1的个数，也叫汉明重量
- N插树的层次遍历，以及最左下角的，都是层次遍历 
- Integer.floor Integer.ceil Integer.round()



## 2021.3.23
- 今天的这几道题目都有一点点不太会做~ ，课程表问题，拓扑排序
- 以及树的最大深度，
- 填充颜色0 和1 ，BFS，任重而道远啊
- queue.peek() ,是返回但是不删除


## 2021.3.24
- 现在已经两百了，只能说任重而道远啊！！！！


## 2021.3.25
- 新增加了DP这个模块，放置我的DP解题方法
- 今天的三个题目都是分割回文字符串的，关键是找到 DP[I][J]，然后再通过题目的意思来找到正确的结果
- 是否能分成三个，直接遍历  0 i j len，看三个阶段是不是都可以是字符串就可以了
- 最短的分发，给出一个count[] 数组，记录分割的次数，每次增加一个，
- 如果回文，并且J ！= 0 ，此时我们就让 dp[j] 和 dp[j - 1] + 1，选择一个最小的
- 如果回文，并且 J == 0 ，此时 count[0] = 0，返回最后的count[len - 1];
- 找出所有的分发，直接dfs，如果i -j 是回文字符串，那么就遍历，
- 偷二叉树的，不会偷了，哈哈哈····

## 2021.3.26
- 自己也太菜了把，YFD一个题目都没有做出来，一个半小时啊，我的天
- WY也没有做出来，自己实在太差劲了，
- 丑数这个题目不会做
- 第四题也没有做出来，归并在哪里啊？？？？太菜了 

## 2021.3.28
- 今天的ZJ只做出来了两道题目，后面两道暴力求解，错误
- 学习了蓄水池算法，从一个O(N)的数组中随机的选择一个数字


## 2021.3.30
- 今天做记忆化的题目，记忆化到底是什么意思？
- set不能保证顺序，在有排序，去重的考虑上，还是自己过滤一遍，O（n） 好于 O（n lg n）
- 面试题目的恢复空格，使用动态规划，从后往前不断的更新
 Set<String> set = new HashSet<>(Arrays.asList(dict));

## 2021.3.31
- 今天字节面试，接雨水的题目没有做出来，我们来做一下
- 自己可能磨蹭了二十多分钟，还是没有写出来，小哥哥的态度还是很好的~  自己再加油吧！！！
- 377,组合4，和兑换钱币的问题很相似，都是两重的for 循环 【自己不理解


## 2021.4.2
- 今天做了两个栈来实现队列，和两个队列来实现栈
- 我去取外卖啦~~ baibai


## 2021.4.5
- 感觉自己的脑子就是一团浆糊，什么都想不到
- 二叉树的最大路径和  5行的代码
- 最相近的公共祖宗（二叉搜索树） ？ 怎么自己又忘了··· 妈耶，三岁小孩子的智商吧
- root p q ：如果 root 为空，那么return false， lson rson if( lson && rson || (p.val = q.p.value ||lson || rson))
- return 


## 2021.4.6
- 删除二叉搜索树的节点，进行递归的删除就可以了，如果右节点存在，就找右边的最小的
- 替换掉，然后删除它。如果右节点不存在，就找左节点最大的，替换掉，然后删除它
- 路径的总和，使用dfs ，
- 二叉搜索树变换为数组和，只需要进行调换就可以了
- 复习了中序遍历
- 写一遍硬币的兑换


## 2021.4.7
- 今天又是受打击的一天，人生无望！！！！


## 2021.4.8
- 不知不觉2021年已经过了三分之一了
- 今天学习了并查集，id 和count， find union 和 connect
- 晚上做了两个动态规划的题目，
- 使用最小的代价爬楼梯， dp[i] = Math.min(dp[i - 1] + cost[i - 1],dp[i - 2] + cost[i - 2]);
- 能否赢取比赛~
 

## 2021.4.9
- 终于把编辑距离搞定了~~  开心 



## 2021.4.10
- 做了每日一题目，丑数，范围是【-MAX, MAX -1】，其中 0 是false， 1 是 true
- 合并K 个有序链表，使用priorityQueue 
- PriorityQueue<ListNode> q = new PriorityQueue<>((x,y)->x.val - y.val);
- 现在来膜拜大神，有一个东南大学的！！！  28名，太强了！！！！  1700+ 的题目，是真的强


## 2021.4.11
- 位运算的专题
- 数组中出现 n / 2的元素， 用随机发
- 4的幂
- hashmap 做的DNA序列
- 丢失的数字，使用加法，看和差多少 


## 2021.4.12
- 今天进行了美团和腾讯的面试，面完就显示已经挂掉了
- 没关系~~~~  只要比昨天的自己优秀，就足够了
- 冲冲冲，做了二叉树的坡度这样的一个题目

## 2021.4.13
- 随机数中的黑名单 710
- 做了二叉搜索树的两个题目，求和树，直接从开始加就好
- BiNode，将二叉树变为链表
- 判断一棵树所有的值都是一样的
- 查看二叉搜索树，怎么进行搜索，递归的进行搜索



## 2021.4.14
- 二叉树的直径
- 如果是空的话，就直接返回
- 获取他的左子节点和右子节点的信息
- 比较ans 和 左+右+自己的大小，赋值给ans
- 返回左右最大的一个 + 1
- ans也就是在求深度的中间添加了一个 ans = Math.max(ans, left + right + 1)


## 2021.4.15
- 进行了美团的二面，累死了
- 今天了解了priorityqueue 默认是最小堆~ 加油！！！！

## 2021.4.18
- 买卖股票的第三个题目，有四种状态，我们写出状态转移方程
- buy1，sell1，buy2，sell2


## 2021.4.19
- 两个两个链表的反转
- node = head.next,  head.next = Swap(node.next) node.next = head.next
- 30题目，串联所有子字符串，使用两个hashmap，记录状态，再使用一个滑动窗口，从前到后滑~ 
- 今天的状态很不好哈，冲冲冲！！！
- 如果能够学到一点点的东西，能够为人类做出一点点进步，那人生就赚了！！！！
- 每天养成一个好的小习惯，现在的习惯是~每天跑两公里，坚持！！！


## 2021.4.20
- 今天跑了两公里~
- ( (j - i) >> 2 ) + i ，移位之后一定要括起来


## 2021.5.10
- **767重构字符串，不会做**
- 做了摆动序列二 和求平均值 


## 2021.5.11
- 旋转链表，先将链表围成环，然后再从后往前找  len - k % len 个位置，再将环解开
- 二维数组的排序，X^2 + Y^2 越小的，排在越前面

## 2021.5.13
- 链表的反转【left ，right】指定区间的反转
- 删除特定数值的元素
- 奇偶链表，奇数放前面，偶数放后面
- 找到环形链表的第一个元素
- 找到相交链表的第一个元素



## 2021.5.20
- 1033题目
// a b c 的大小关系
// 如果说 c - a == 2，则没有办法移动，因为已经OK 了
// 如果说 a，c任意和b差值小于等于 2， 则可以一步到位，否则至少两部
// 最多移动的步数 是 c - a - 2
  

## 2021.5.21
- 1227：飞机座位出错的概率，最后就是0.5 和 1
- 1503，最后一只蚂蚁掉下来的时间 
- 1035，每日一题，不相交的线，使用动态规划


## 2021.5.22
- 今天下午一点多，袁爷爷去世了，一路走好，国士无双！！！！
- 要好好吃饭，好好珍惜时间，为中国，为民族做出自己的贡献
- 袁爷爷一路走好，一路走好 
- 329，矩阵中最大的递增路径，我们使用深度优先搜索，加DP的方法
- 珍惜时间，一寸光阴一寸金，寸金难买寸光阴！！！！
