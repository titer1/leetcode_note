from think in java ListPerformance.java output

#观察小节
- array 大小固定
- linkedlist get/set最多花销， 源于随机访问性差,花销几乎和数据规模成正比 O(N)
- 基于arrary的 ,arraylist or vector对于 改变表结构的操作查，体现insert/remove ,iteradd
- 区分add操作, 一个是list add,一个是 iterater add

##关于ArrayList和Vector区别如下：线程安全
1.ArrayList在内存不够时默认是扩展50% + 1个，Vector是默认扩展1倍。
2.Vector提供indexOf(obj, start)接口，ArrayList没有。
3.Vector属于线程安全级别的，但是大多数情况下不使用Vector，因为线程安全需要更大的系统开销。
http://www.cnblogs.com/wanlipeng/archive/2010/10/21/1857791.html


##附件输出
/* Output: (Sample)
--- Array as List ---
 size     get     set
   10     130     183
  100     130     164
 1000     129     165
10000     129     165


--------------------- ArrayList ---------------------
 size     add     get     set iteradd  insert  remove
   10     121     139     191     435    3952     446
  100      72     141     191     247    3934     296
 1000      98     141     194     839    2202     923
10000     122     144     190    6880   14042    7333
--------------------- LinkedList ---------------------
 size     add     get     set iteradd  insert  remove
   10     182     164     198     658     366     262
  100     106     202     230     457     108     201
 1000     133    1289    1353     430     136     239
10000     172   13648   13187     435     255     239
----------------------- Vector -----------------------
 size     add     get     set iteradd  insert  remove
   10     129     145     187     290    3635     253
  100      72     144     190     263    3691     292
 1000      99     145     193     846    2162     927
10000     108     145     186    6871   14730    7135
-------------------- Queue tests --------------------
 size    addFirst     addLast     rmFirst      rmLast
   10         199         163         251         253
  100          98          92         180         179
 1000          99          93         216         212
10000         111         109         262         384
*///:~
