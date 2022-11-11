//Write a Program which accept number from user and Return Sum of Odd Digit of that number.

import java.lang.*;
import java.util.*;
//////////////////////////////////////////////////////////////////////////////////////////////
/*
Function Name:Factor
Description:Accept input from user and return Sum of Odd Digit 
Input:Integer
Output:Integer
Auther:Sukanya
Date:11/11/2022
*/

//////////////////////////////////////////////////////////////////////////////////////////////

class SumOddDigit
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          int iRet=dobj.OddSum(iValue);

          System.out.println("Summation of Odd Digit:"+iRet);

    }
}
class Digit  
{
   int OddSum(int iNo)
   {
      int iDigit=0,iRev=0;
      int iSum=0;

      if(iNo==0)   //Filter
      {
        return 1;
      }

      while(iNo!=0)
      {
        iDigit=iNo % 10;
        if(iDigit % 2!=0)
        {
            iSum=iSum + iDigit;
        }
        iNo=iNo / 10;
      }
      return iSum;
   }
}
////////////////////////////////////////////////////////////////////////////////////////////
