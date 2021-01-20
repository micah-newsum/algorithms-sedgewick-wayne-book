package chapter1.section1.arrays;

public class Exercise17 
{
	public static void main(String args[])
	{
		String s = exR2(3);
	}
	
	public static String exR2(int n)
	{
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}
}
