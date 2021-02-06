package chapter1.section3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayStack<Item> implements Iterable<Item>
{
	private Item[] a = (Item[]) new Object[1];
	private int N;
	
	public void push(Item item)
	{
		//check if item can be added to array. If not, double array size and resize.
		if (N == a.length) resize(2*a.length);
		a[N++] = item;
	}
	
	public Item pop()
	{
		//get item from top of array and decrement N.
		Item item = a[--N];
		//assign top of array element to null;
		a[N] = null;
		//resize array if N is 1/4 of array size
		if (N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}
	
	public boolean isEmpty()
	{
		return N == 0;
	}
	
	int size()
	{
		return N;
	}
	
	private void resize(int max)
	{
		// dimension new array temp with size max
		Item[] temp = (Item[]) new Object[max];
		
		// iterate over each element in a and assign to temp
		for (int i = 0; i < N; i++)
		{
			temp[i] = a[i];
		}
		
		// assign temp to a
		a = temp;
	}
	
	public Iterator<Item> iterator()
	{
		return new ReverseArrayIterator();
	}
	
	/**
	 * Inner class
	 * Supports LIFO iteration
	 * @author mnewsum
	 *
	 */
	private class ReverseArrayIterator implements Iterator<Item>
	{
		private int i = N;
		
		public boolean hasNext()
		{
			return i > 0;
		}
		
		public Item next()
		{
			return a[--i];
		}
		
		public void remove()
		{
			
		}
	}
	
	
	public static void main(String[] args) 
	{
		ResizingArrayStack<String> s = new ResizingArrayStack<>();
		
		while (!StdIn.isEmpty())
		{
			String item = StdIn.readString();
			if (!item.equals("-"))
			{
				s.push(item);
			}
			else if (!s.isEmpty())
			{
				StdOut.print(s.pop() + " ");
			}
		}

		StdOut.println("(" + s.size() + " left on stack)");
		
		//test iteration logic
		ResizingArrayStack<String> t = new ResizingArrayStack<>();
		
		t.push("Micah");
		t.push("Jairus");
		t.push("Newsum");
		
		for (String name : t)
		{
			StdOut.println(name);
		}		
	}
}
