class QueueKotlin {

    class Node(var data:Int){
        var next:Node? = null
    }

    private var tail:Node? =null
    private var head: Node? = null

    fun add(data: Int){
        val newNode = Node(data)
        tail?.let {
            tail?.next = newNode
        }
        tail = newNode

        //handle the empty head
        if (head==null){
            head = tail
        }
    }


    fun remove():Int?{
        head?.let {
           val data = head?.data
            head = head?.next
            return data
        }
        return null
    }

    fun peek():Int?{
        head?.let {
            return head?.data
        }
        return null
    }

    fun isEmptyQueue():Boolean{
        return head==null
    }
}

fun main(args:Array<String>){
    val queue = QueueKotlin()

    println(queue.isEmptyQueue())
    queue.add(10)
    queue.add(20)
    queue.add(30)
    queue.add(40)
    queue.add(50)
    println(queue.isEmptyQueue())
    queue.add(60)

    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())
    println("peek:"+queue.peek())
    println("pop:"+queue.remove())

}