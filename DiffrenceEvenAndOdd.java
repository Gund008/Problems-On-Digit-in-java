//Write a Program which accept number from user and Display Even Digit of that number.

import java.lang.*;
import java.util.*;
//////////////////////////////////////////////////////////////////////////////////////////////
/*
Function Name:Factor
Description:Accept input from user and Diffrence Even and odd  Digit 
Input:Integer
Output:Integer
Auther:Sukanya
Date:11/11/2022
*/

//////////////////////////////////////////////////////////////////////////////////////////////
class Digit  
{
   int DiffEvenOddCount(int iNo)
   {
      int iDigit=0,iRev=0;
      int iEven=0,iOdd=0,iDiff=0;

      if(iNo==0)
      {
        return -1;
      }
      while(iNo!=0)
      {
        iDigit=iNo % 10;
        if(iDigit % 2==0)
        {
           iEven=iEven + iDigit;
        }
        else
        {
            iOdd=iOdd + iDigit;
        }
        iNo=iNo / 10;
      }
      return iDiff=iEven - iOdd;
   }
}
////////////////////////////////////////////////////////////////////////////////////////////
class DiffrenceEvenAndOdd
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          int iRet=dobj.DiffEvenOddCount(iValue);

          System.out.println("Countof Even And Odd Digit:"+iRet);

    }
}