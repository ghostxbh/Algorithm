# 二叉排序树

### 图解
- [图解二叉树搜索算法](https://blog.csdn.net/BaiHuaXiu123/article/details/52488443)

### 介绍
什么是[二叉查找树](https://baike.baidu.com/item/%E4%BA%8C%E5%8F%89%E6%8E%92%E5%BA%8F%E6%A0%91/10905079) ：  
根节点的值大于其左子树中任意一个节点的值，小于其右节点中任意一节点的值，这一规则适用于二叉查找树中的每一个节点。  
本文章重点来讨论一下关于二叉查找树删除节点的问题。  
有一下二叉查找树，如图：  

![](https://img-blog.csdnimg.cn/20190502235601654.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3JvZG1hbjE3Nw==,size_16,color_FFFFFF,t_70)

在删除节点的时候我们只需考虑一下三种情况：  
（1）要删除的节点是叶子结点，如图：

![](https://img-blog.csdnimg.cn/20190502235746927.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3JvZG1hbjE3Nw==,size_16,color_FFFFFF,t_70)

（2）要删除的节点有左节点但是没有右节点，或者有右节点但是没有左节点，如图：

![](https://img-blog.csdnimg.cn/20190503000029955.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3JvZG1hbjE3Nw==,size_16,color_FFFFFF,t_70)

（3）要删除的节点既有左节点又有右节点，在这种情况下，我们只需要将找到待删节点的右子树中值最小的节点，将其删除并且获取其值，并用其值替换待删节点的值即可。如图：

![](https://img-blog.csdnimg.cn/20190503001216375.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3JvZG1hbjE3Nw==,size_16,color_FFFFFF,t_70)

如上图所示，如果要删除节点7，则需寻找其右子树中节点值最小的9，并且该值一定位于该右子树的最左子节点；但是还有一种情况，如图一右子树没有左节点，但是只有右节点，这种情况就回到了前面的第二种情况。
具体代码如下：注意Node类是一个内部类，在使用时注意方法。
