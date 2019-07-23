import java.util.EmptyStackException;

public class Stack {

    //Node class for all next related details:
    class Node{
         int data;
         Node next;

         //Node constructor:
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    //Push operation:
    private void pushToStack(int data){
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    private int popFromStack(){
        if (head==null){
          //  throw new EmptyStackException();
            return 0;
        }else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int peekIntoStack(){
        return head.data;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pushToStack(10);
       // System.out.println(stack.peekIntoStack());
        stack.pushToStack(12);
        stack.pushToStack(13);
        stack.pushToStack(15);
        stack.pushToStack(16);
        stack.pushToStack(17);
        stack.pushToStack(19);
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());
        System.out.println(stack.popFromStack());

    }
}
