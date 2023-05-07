/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array.  */
import java.util.Scanner;
public class Q8{
    public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of rows and coloumbs");
       int m = sc.nextInt();
       int n = sc.nextInt();
       System.out.println("Enter the elements of the 2D array:");
       int arr[][]=new int[m][n];
       int sum=0;
       for (int i=0;i<m;i++)
           for(int j=0;j<n;j++)
           arr[i][j]=sc.nextInt();
           sc.close();
       System.out.println("The elements of Matrix is: ");
       for (int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++) 
           {
               System.out.print(arr[i][j]+" ");
               sum+=arr[i][j];
           }
           System.out.println();
       }
       System.out.print("The sum of elements of the Matrix is "+sum);

   }}
    
