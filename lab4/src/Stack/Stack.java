package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	private Queue<Integer> queue = new LinkedList<Integer>();
    private int size;

    public Stack()
    {
    	this.size = 1;
    }
    public Stack(int size) {
    
        this.size = Math.abs(size);
    }

    public void push(int element) {
        if (queue.size() == size) {
            queue.remove();
        }
        queue.add(element);
    }

    public int pop() {
        if(queue.size()== 0) {System.out.println("Stack is empty!!");return -1;}
        return queue.remove();
       
    }
    
}
