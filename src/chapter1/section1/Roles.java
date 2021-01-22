package chapter1.section1;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Roles 
{
	public static void main(String args[])
	{
		int T = Integer.parseInt("10");
		final int SIDES = 6;
		Counter[] rolls = new Counter[SIDES+1];
		for (int i = 1; i <= SIDES; i++)
			rolls[i] = new Counter(i + "'s");
		
		for (int t = 0; t < T; t++)
		{
			int result = StdRandom.uniform(1,SIDES+1);
			rolls[result].increment();
		}
		
		for (int i = 1; i <= SIDES; i++)
			StdOut.println(rolls[i]);
	}
}
