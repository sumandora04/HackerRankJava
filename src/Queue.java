public class Queue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;


    //First In First Out.
    //Add from tail.
    private void addItemToQueue(int data) {
        //Create a new next to add to queue:
        Node newNode = new Node(data);

        if (tail != null) {
            tail.next = newNode; //Adding node to the tail and pointing the tails next to the new node.
        }
        tail = newNode;// assign the new node to the tail.

        //handle thje empty head when the insertion is for the first time:
        if (head == null) {
            head = tail; // assign the tail to the head.
        }
    }


    //Remove from head:
    private int removeFromQueue() {
        if (head == null) {
            throw new ClassCastException("Empty queue");
        } else {
            int data = head.data;
            head = head.next;

            //After remove if the queue is empty then handle the tail also:
            if (head == null) {
                tail = null;
            }

            //Return the data:
            return data;
        }
    }

    //Peek the queue data:
    //Return the head data:
    private int peekIntoQueue(){
        return head.data;
    }

    private boolean isQueueEmpty(){
        return head==null;
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isQueueEmpty());
        queue.addItemToQueue(10);
        queue.addItemToQueue(20);
        System.out.println(queue.isQueueEmpty());
        queue.addItemToQueue(30);
        queue.addItemToQueue(40);
        queue.addItemToQueue(50);
        queue.addItemToQueue(60);

        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());
        System.out.println("Peek:"+queue.peekIntoQueue());
        System.out.println("Pop:"+queue.removeFromQueue());

    }

}
