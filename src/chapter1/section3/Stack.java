package chapter1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> implements Iterable<Item>
{
	private Node first;
	private int N;
	
	private class Node
	{
		Item item;
		Node next;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public int size()
	{
		return N;
	}
	
	public void push(Item item)
	{
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop()
	{
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Iterator<Item> iterator()
	{
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		
		public boolean hasNext()
		{
			return current != null;
		}
		
		public void remove()
		{
			
		}
		
		public Item next()
		{
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
	
	public static void main(String[] args) 
	{		
		//test iteration logic
		Stack<String> t = new Stack<>();
		
		t.push("Micah");
		t.push("Jairus");
		t.push("Newsum");
		
		for (String name : t)
		{
			StdOut.println(name);
		}		
	}
}
