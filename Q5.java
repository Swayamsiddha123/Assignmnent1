/*Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows */
import java.util.Scanner;
public class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits of "+n+" until the number is a single digit is:"+sum_Of_Digits(n));
    }
   public static int sum_Of_Digits(int n){
    int sum = 0 ;
    do{
        sum =0;
        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        n=sum;
    }while (sum>9);
    return sum;}}