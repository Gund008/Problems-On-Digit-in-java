//Write a Program which accept number from user and Display Odd Digit of that number.

import java.lang.*;
import java.util.*;
//////////////////////////////////////////////////////////////////////////////////////////////
/*
Function Name:Factor
Description:Accept input from user and Display Odd Digit 
Input:Integer
Output:Integer
Auther:Sukanya
Date:11/11/2022
*/

//////////////////////////////////////////////////////////////////////////////////////////////
class Digit  
{
   void DisplayOdd(int iNo)
   {
      int iDigit=0,iRev=0;
      while(iNo!=0)
      {
        iDigit=iNo % 10;
        if(iDigit % 2!=0)
        {
         System.out.println(""+iDigit);
        }
        iNo=iNo / 10;
      }
   }
}
////////////////////////////////////////////////////////////////////////////////////////////
class OddDigit
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          dobj.DisplayOdd(iValue);

    }
}