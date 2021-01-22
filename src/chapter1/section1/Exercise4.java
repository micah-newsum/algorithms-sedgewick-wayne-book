package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise4 
{
	public static void main(String args[])
	{
		int a = 2;
		int b = 1;
		if (a > b) { StdOut.println("hello world.");}		
		if (a > b) StdOut.println("hello world.");
		if (a > b) StdOut.print("hello"); else StdOut.print(" world");
	}
}
