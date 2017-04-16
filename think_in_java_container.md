

#1 list容器选择

```
The best approach is probably to choose an ArrayList as your default 
and to change to a LinkedList if you discover performance problems due to many insertions and removals from the middle of the list. 
And of course, if you are working with a fixed-sized group of elements, use an array.

```

可以看出，在ArrayList中进行随机访问（即get()）以及循环反复是最划得来的；但对于LinkedList却是一个不小的开销。但另一方面，在列表中部进行插入和删除操作对于LinkedList来说却比ArrayList划算得多。我们最好的做法也许是先选择一个ArrayList作为自己的默认起点。以后若发现由于大量的插入和删除造成了性能的降低，再考虑换成LinkedList不迟。

66 note: 插入删除 O（N) vs O(1)

#2 hashset选择
```
The performance of HashSet is generally superior to TreeSet for all operations (but in particular for addition and lookup, the two most important operations). 
The only reason TreeSet exists is because it maintains its elements in sorted order, so you use it only when you need a sorted Set. Feedback
Note that LinkedHashSet is slightly more expensive for insertions than HashSet; this is because of the extra cost of maintaining the linked list along with the hashed container. However, traversal is cheaper with LinkedHashSet because of the linked list
```


#3 map选择
```
In the end, when you’re using a Map, your first choice should be HashMap, and only if you need a constantly sorted Map will you need TreeMap. Feedback
LinkedHashMap is slightly slower than HashMap because it maintains the linked list in addition to the hashed data structure. IdentityHashMap has different performance because it uses == rather than equals( ) for comparisons
```

`66：性能差异都不是看起来的数量级的，因场合来使用`

#4 笔记摘抄
- 函数内返回数组 in java Java采用的是类似的方法，但我们能“返回一个数组”。当然，此时返回的实际仍是指向数组的指针。但在Java里，我们永远不必担心那个数组的是否可用——只要需要，它就会自动存在。而且垃圾收集器会在我们完成后自动将其清除。
- 使用Enumeration(66认为也可以是 迭代器)，我们不必关心集合中的元素数量

- 容器取交集
```java
    // Keep all the elements that are in both
    // c and c2 (an intersection of sets):
    c.retainAll(c2);
```
	- 更多容器操作 
	Collection1.java
	- add *All
	- remove
	- contains
	- isEmpty
	- size()
  
- fill()方法，利用该方法可以用任何两维数组（由Object构成）填充任何Map

#ref 
多读 think in java chapter 11

