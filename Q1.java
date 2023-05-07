/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.*/
import java.util.*;
public class Q1{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The positive integer greater than 2 from command line argument is:");
    int n = sc.nextInt();
    sc.close();
    int c =0;
    while(n>2){
        n=n/2;
          c++;
        
    }
    System.out.println("The number of times one must repeatedly divide this number by 2 "+
    "before getting a value less than 2 is : "+c);
}
}
