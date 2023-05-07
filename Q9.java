/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.  */
import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[][]=new double[4][4];
		System.out.println("Enter the elments of the 4X4 Matrix: ");
		for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			arr[i][j]=sc.nextDouble();

		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
        sc.close(); 
    }    
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum=0;
        for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
                if (i==j)
                    sum=sum+m[i][j];

        return sum ; 
    }

}