package src;

import com.sun.tools.javac.util.Assert;

public class DoublyLinkList<E> extends AbstractList<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;
	
	public DoublyLinkList(){
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		count = 0;
	
	
	}

	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
		// construct new element
		tail = new DoublyLinkedNode<E>(value, null, tail);
		// fix up head
		if (head == null) head = tail;
		count++;
	}
	
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}

	
	
}
