package test;

import com.uzykj.algorithm.tree.binary.BinarySortTree;

/**
 * @ClassName TreeTest
 * @Description desc
 * @Author ghostxbh
 */
public class TreeTest {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        BinarySortTree binTree = new BinarySortTree();
        for (int i : arr) {
            binTree.add(binTree.new Node(i));
        }
        //删除数值
        binTree.delete(5);
        //查看树中的值
        binTree.frontShow();

        //查找
        BinarySortTree.Node node = binTree.new Node(3);
        BinarySortTree.Node res = binTree.SearchNode(node.value);
        System.out.println(res.value);
        BinarySortTree.Node temp = binTree.SearchNode(20);
        System.out.println(temp.value);
    }
}
