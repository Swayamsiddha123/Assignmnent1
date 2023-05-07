/*Write a java program to check whether a number is a spy number or not. 
 * spy number:sum and product of all digits are equal
 */ 
import java.util.*;
public class Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num = n;
        int sum =0;
        int pro = 1;
    while(n!=0){
        int r = n%10;
        sum +=r;
        pro *=r;
        n/=10;
    
    }
    if(sum==pro){
        System.out.println(num+" is a spy number");
    }else{
        System.out.println(num+" is not a spy number");
    }
    sc.close();
}}