package chapter1.section1;

public class ArrayExamples 
{	
	public static void main(String args[])
	{
		// long form
		double[] a;
		a = new double[10];
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("a[%d] = %f\n",i,a[i]);
			a[i] = 1.00;
		}
		
		//short form
		double[] b = new double[10];
		for (int i = 0; i < a.length; i++)
			System.out.println(b[i]);
		
		//initializing form
		int[] c = {0,1,2,3,4,5};
		System.out.println(c);
		
		//aliasing
		int[] d = c;
		d[0] = 1;
		System.out.println(c[0]);
		System.out.println(d[0]);
		
		//two dimensional array
		double[][] e = new double[4][5];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 5; j++)
				e[i][j] = 1.00;
		
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 5; j++)
				System.out.printf("e[%d][%d]=%f\n",i,j,e[i][j]);				
	}

}
