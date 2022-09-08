/* 
program:Simple interest
@author:Sumit Saha
@Date:8 sep 2022
*/
 

import java.util.Scanner;

    //declearing aclass

     class Simpleinterest
{
    public static void main(String args[])  
	
    {
	    int t=5;
        float p, r, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        
        sinterest = (p * r * t);
        System.out.print("Simple Interest is: " +sinterest);
    }
	
	//end of main
}
// end of class Simpleinterest