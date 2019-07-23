import java.util.*

class StackKotlin {
    class Node(var data: Int) {
        var next: Node? = null
    }

    var head: Node? = null

    fun push(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            newNode.next = head
            head = newNode
        }
    }


    fun pop(): Int? {
        if (head == null) {
            throw EmptyStackException()
        } else {
            val data = head?.data
            head = head?.next
            return data
        }
    }

    fun peek(): Int? {
        return head?.data
    }

    fun isStackEmpty(): Boolean {
        return head == null
    }
}

fun main(args: Array<String>) {

    var stack = StackKotlin()
    println(stack.isStackEmpty())
    stack.push(20)
    stack.push(10)
    stack.push(30)
    stack.push(40)
    stack.push(50)
    println(stack.isStackEmpty())
    stack.push(60)

    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.peek())

}