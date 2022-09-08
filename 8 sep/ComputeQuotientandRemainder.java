/*
program: Compute Quotient and Remainder
@auther: Sumit Saha
@Date: 8sep 2022
*/
  //declearing a class
  
import java.util.Scanner;

 class ComputeQuotientandRemainder 

{
   public static void main(String args[])
   
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of the divisor:: ");
      int divisor = sc.nextInt();
      int divident = sc.nextInt();

      int quotient = divident / divisor;
      int remainder = divident % divisor;

      System.out.println("Quotient value:"+quotient);
      System.out.println("Remainder value:"+remainder);
   }
   
   //end of main
}

 //end of class ComputeQuotientandRemainder 
 
 
 
