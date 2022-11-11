//Write a Program which accept number from user and  return the Count of Even Digit of that number.

import java.lang.*;
import java.util.*;
//////////////////////////////////////////////////////////////////////////////////////////////
/*
Function Name:Factor
Description:Accept input from user and Return Count of that Odd Digit 
Input:Integer
Output:Integer
Auther:Sukanya
Date:11/11/2022
*/

//////////////////////////////////////////////////////////////////////////////////////////////
class Digit  
{
   int DisplayOddCount(int iNo)
   {
      int iDigit=0,iRev=0;
      int iEvenCnt=0;

      if(iNo==0)   //Filter
      {
        return 1;
      }

      while(iNo!=0)
      {
        iDigit=iNo % 10;
        if(iDigit % 2==0)
        {
           iEvenCnt++;
        }
        iNo=iNo / 10;
      }
      return iEvenCnt;
   }
}
////////////////////////////////////////////////////////////////////////////////////////////
class CountOdd
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          int iRet=dobj.DisplayOddCount(iValue);

          System.out.println(("Count of Odd Digit"+iRet));

    }
}