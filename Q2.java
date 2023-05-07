/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
human body fat in populations. It is computed by taking the individual's weight (mass) in
kilograms and dividing it by the square of their height in meters. i.e.
Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
Write a java program by using conditional statement to show the category for a given BMI.
Category BMI
Less than 18.5 Underweight
18.5 to 24.9 Normal Weight
25.0 to 29.9 Overweight
30.0 or more Obese*/
import java.util.*;
public class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person Weight in kg:");
        int weight = sc.nextInt();
        System.out.println("Enter height of person in meter: ");
        double height = sc.nextDouble();
        sc.close();
        double BMI = weight/Math.pow(height,2);
        if(BMI<18.5){
            System.out.println("This person is Underweight");
        }
        else if(BMI>18.5 && BMI<24.9){
            System.out.println("This person is Normalweight");
        }else if(BMI>25 && BMI<29.9){
            System.out.println("This person is Overweight");
        }else if(BMI>30){
            System.out.println("This person is Obese");
        }
    }
}
