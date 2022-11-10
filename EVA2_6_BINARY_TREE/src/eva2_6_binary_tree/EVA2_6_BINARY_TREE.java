package eva2_6_binary_tree;

/**
 * @aUthor DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */

public class EVA2_6_BINARY_TREE {

    
    public static void main(String[] args) {
        Binary_Tree binTree = new Binary_Tree();
        
        binTree.add(13);
        binTree.add(10);
        binTree.add(18);
        binTree.add(2);
        binTree.add(11);
        binTree.add(17);
        binTree.add(20);
        binTree.add(16);                
        binTree.add(16);
        

        System.out.println("\nÁrbol binario In Order");
        binTree.inOrder();
        
       
        System.out.println("\nÁrbol binario Pre Order");
        binTree.preOrder();
       
        System.out.println("\nÁrbol binario Post Order");
        binTree.postOrder();
    }    
}
