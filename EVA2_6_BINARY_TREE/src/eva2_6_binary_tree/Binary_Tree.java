package eva2_6_binary_tree;

/**
 * @author  DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */

public class Binary_Tree {
    private Nodo root;
    
    public Binary_Tree() {
        this.root = null;
    }        
    
    // Método para el usuario
    public void add(int value) {
        if (root == null) {
           root = new Nodo(value);
        } else {
            recursiveAdd(value, root);
        }
    }

    private void recursiveAdd(int value, Nodo actualNode) {
       
        Nodo newNode = new Nodo(value);
        
        if (value < actualNode.getValue()) { // El valor va hacia la izquierda
            if (actualNode.getLeft() == null) {
                actualNode.setLeft(newNode);
            } else {
                recursiveAdd(value, actualNode.getLeft());
            }
        } else if (value > actualNode.getValue()) { // El valor va hacia la derecha
            if (actualNode.getRight() == null) {
                actualNode.setRight(newNode);
            } else {
                recursiveAdd(value, actualNode.getRight());
            }
        } else { // Si el valor es igual
            System.out.println("Elemento repetido.");
        }
    }
    
    /* 
    Imprimir los valores: In Order
    Izquierda - valor - derecha
    */
    
    // Método público
    public void inOrder() {
        recursiveInOrder(root);
        System.out.println("");
    }
    
    // Método privado recusivo
    private void recursiveInOrder(Nodo actualNode) {
        if (actualNode != null) {
            recursiveInOrder(actualNode.getLeft());
            System.out.print(actualNode.getValue() + " ");
            recursiveInOrder(actualNode.getRight());
        }
    }

    void preOrder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void postOrder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
