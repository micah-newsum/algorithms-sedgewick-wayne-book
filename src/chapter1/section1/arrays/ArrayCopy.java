package chapter1.section1.arrays;

public class ArrayCopy {

	public static void main(String[] args) 
	{
		double[] vals = {1.0,3.0,5.0,6.0,3.0,7.0,8.0,2.0,9.0};
		double[] copy = new double[vals.length];
		for (int i = 0; i < vals.length; i++)
			copy[i] = vals[i];
		System.out.printf("All %d values from vals copied to copy, which now also has length %d.", vals.length, copy.length);
	}

}
