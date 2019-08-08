public class BST {

    class Node {
        int key;
        String value;
        Node left, right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        Node findMin() {
            if (left == null) {
                return this;
            } else {
                return left.findMin();
            }
        }
    }

    private Node root;

    public BST() {
        this.root = null;
    }

    //Searching for the key:
    public String findKey(int key) {
        Node node = findNode(root, key);

        return node == null ? null : node.value;
    }

    //Function to find the node and return it:
    private Node findNode(Node node, int key) {

        if (node == null || node.key==key){
            return node;
        }else if (key<node.key){
            return findNode(node.left,key);
        }else if (key>node.key){
            return findNode(node.right,key);
        }else {
            return null;
        }
    }


    //Insertion:
    public void insert(int key, String value){
        root = insertItem(root, key, value);
    }

    private Node insertItem(Node node, int key, String value){
        //Create the node to insert data:
        Node newNode = new Node(key, value);

        if (node==null){
            node = newNode;
            return node;
        }

        if (key<node.key){
           node.left = insertItem(node.left,key,value);
        }else if (key>node.key){
            node.right = insertItem(node.right,key,value);
        }

        // If the key is duplicate, ignore it and return the fully formed tree.
        return node;
    }

    //Deletion:
    private Node findMinNode(Node node){
        return node.findMin();
    }

    private int findMinKey(){
        return findMinNode(root).key; // Start from the root
    }

    public void delete(int key){
        root = deleteNode(root,key);
    }

    private Node deleteNode(Node node, int key){
        //Search the key to delete:
        if (node==null){
            return null;
        }else if (key<node.key){
            node.left = deleteNode(node.left, key);
        }else if (key>node.key){
            node.right = deleteNode(node.right,key);
        }else {
            //We found the key which we need to delete:
            // case-1: No child- make the node null:
            if (node.left==null && node.right==null){
                node= null;
            }//Case-2: One child - check for left or right child and swap the value.
            else if (node.right==null){ // Have a left child
                // Take the left child to the parent node:
                node = node.left;
            }else if (node.left==null){
                node = node.right;
            }
            //Case-3: Two child:
            else {
                //Find the min in the right node:
                Node minRightNode = findMinNode(node.right);

                // Create the duplicate of the minRightNode:
                node.key = minRightNode.key;
                node.value = minRightNode.value;

                //Now the minRightNode will be the duplicate node. delete it:
                node.right = deleteNode(node.right, node.key);
            }
        }
        return node;
    }


    private void inOrderTraversal(Node node){
        if (node!=null){
            inOrderTraversal(node.left);// Go left
            System.out.println(node.key);// Print the root
            inOrderTraversal(node.right);// Go right
        }
    }

    private void preOrderTraversal(Node node){
        if (node!= null){
            System.out.println(node.key);//Print the root
            preOrderTraversal(node.left);//Go left
            preOrderTraversal(node.right);//Go right
        }
    }

    private void postOrderTraversal(Node node){
        if (node!=null){
            postOrderTraversal(node.left);//Go left
            postOrderTraversal(node.right);//Go right
            System.out.println(node.key);//Print root
        }
    }

    public void inOrder(){
        System.out.println("InOrder traversal:");
        inOrderTraversal(root);
    }

    public void preOrder(){
        System.out.println("PreOrder traversal:");
        preOrderTraversal(root);
    }

    public void postOrder(){
        System.out.println("PostOrder traversal:");
        postOrderTraversal(root);
    }



    public static void main(String[] args) {
        BST bst = new BST();

//        bst.insert(1,"Suman");
//        bst.insert(1,"Suman");
//        bst.insert(2,"Shekhar");
//        bst.insert(2,"Shekh");
//
//        System.out.println(bst.findKey(1));
//        System.out.println(bst.findKey(2));
//
//        bst.delete(1);
//        bst.delete(2);
//        bst.delete(2);
//
//        System.out.println(bst.findKey(1));
//        System.out.println(bst.findKey(2));

        bst.insert(6,"A");
        bst.insert(2,"B");
        bst.insert(1,"C");
        bst.insert(11,"D");
        bst.insert(8,"E");
        bst.insert(15,"F");
        bst.insert(9,"G");
        bst.insert(10,"H");

        bst.preOrder();
        bst.inOrder();
        bst.postOrder();

        System.out.println(bst.findKey(6));
        bst.delete(1);
        bst.delete(6);
        bst.preOrder();
        System.out.println(bst.findMinKey());
    }
}
