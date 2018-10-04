package komissarov.binaryTree;

import komissarov.binaryTree.BinaryTree;
import komissarov.binaryTree.TreeOutput;

public class Main {
    public static void main(String[] args){
        int[] array = {24, 15, 17, 4, 23, 35, 1, 3, 20, 2, 36, 10};
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < array.length; i++) {
            tree.add(array[i]);
        }
        System.out.println(tree.containsNode(17));
        TreeOutput.printTree(tree);
        tree.remove(10);
        TreeOutput.printTree(tree);
        tree.remove(tree.search(35), 35);
        TreeOutput.printTree(tree);
        tree.rootInsert(10);
        TreeOutput.printTree(tree);
    }
}
