/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is 
as follows. */
import java.util.Scanner;
public class Q6{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n+" is odd "+isOdd(n));

    }
    public static boolean isOdd(int n){
        int a=n&1;
		if(a==0)
			return false;
		else 
			return true; 
    }
}