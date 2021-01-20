package chapter1.section1.arrays;

public class FindArrayMaxValue 
{
	public static void main(String args[])
	{	
		double[] vals = {1.0,3.0,5.0,6.0,3.0,7.0,8.0,2.0,9.0};
		double max = vals[0];
		for (int i = 0; i < vals.length; i++)
			if (vals[i] > max) max = vals[i];
		System.out.printf("Max value is %f.",max);	
	}
}
