/*Write a method that returns the sum of all the elements in a specified column in a matrix 
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column. */
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args){
		 Scanner sc =new Scanner(System.in);
			double arr[][]=new double[4][4];
			System.out.println("Enter a 3-by-4 matrix row by row: ");
			for (int i=0;i<3;i++)
			for(int j=0;j<4;j++)
			arr[i][j]=sc.nextDouble();
	        for(int j=0;j<4;j++)
			System.out.println("Sum of the elements at column " +j+"  is  "+sumColumn(arr,j));
	        sc.close();
	    }    
	    public static double sumColumn(double[][] m, int columnIndex)
	    {
	        double sum=0;
	        for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
	        if (j==columnIndex)
	        sum=sum+m[i][j];
            return sum ; 

	}

}