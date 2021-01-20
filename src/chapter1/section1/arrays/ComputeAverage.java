package chapter1.section1.arrays;

public class ComputeAverage {

	public static void main(String[] args) 
	{
		double[] vals = {1.0,3.0,5.0,6.0,3.0,7.0,8.0,2.0,9.0};
		double sum = 0.0;
		for (int i = 0; i < vals.length; i++)
			sum += vals[i];
		double average = sum/vals.length;
		System.out.printf("Average is %f", average);
	}

}
