package chapter1.section1;

public class MatrixMultiplication 
{
	public static void main(String args[])
	{
		int N = 2;
		
		double[][] a = new double[N][N];
		double[][] b = new double[N][N];
		
		initMatrix(a);
		initMatrix(b);
		
//		int N = a.length;
//		double[][] c = new double[2][2];
	}
	
	static void initMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				double random = 10 * Math.random();
				matrix[i][j] = random;
			}				
		}
	}
}
