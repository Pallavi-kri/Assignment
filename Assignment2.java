//WAP a Java program to calculate the factorial of a given number.

import java.util.Scanner;

public class Assignment2 {
    public static long factorial(int n)
    {
      if(n<0){
        throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
      }
      long fact=1;
      for(int i=2;i<=n;i++)
      {
         fact*=i;
      }
      return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no for factorial:");
        int number = sc.nextInt();

        try{
            long result = factorial(number);
           System.out.println("Factore of "+number+" is "+result);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
