package chapter1.section1;

public class ReverseElements {

	public static void main(String[] args) 
	{
		double[] vals = {1.0,3.0,5.0,6.0,3.0,7.0,8.0,2.0,9.0};
		int N = vals.length;		
		for (int i = 0; i < N/2; i++)
		{
			double temp = vals[i];
			vals[i] = vals[N-i-1];
			vals[N-i-1] = temp;
		}
		printReverse(vals);
	}
	
	static void printReverse(double vals[])
	{
		for (int i = 0; i < vals.length; i++)
			System.out.println(vals[i]);
	}
		

}
