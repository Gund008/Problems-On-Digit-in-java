/*
Write a Java Program which accept Number from user and return the count of digit in between 3 and 7.

Input : 2395
Output: 1

Input: 1018
Output :0

Input: 4521
Output :2

Input:9922
Output:0

*/

import java.lang.*;
import java.util.*;

class Program3
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo=sobj.nextInt();

            MarevllousX aobj=new MarevllousX(iNo);
            int iRet=aobj.Countdigit();
            System.out.println(iRet);
      }
}
////////////////////////////////////////////////////////////////////////////////////////////////
class MarevllousX
{
    public int iValue;

    public MarevllousX(int A)
    {
        this.iValue=A;
    }
    
    public int Countdigit()
    {
        if(iValue<0)   //filter
        {
            iValue=-iValue;
        }
        int iDigit,iCnt=0;
        while(iValue!=0)
        {
            iDigit=iValue % 10;
            if((iDigit>3) && (iDigit<7))
            {
                iCnt++;
            }
            iValue=iValue / 10;
        }
        return iCnt;
    }
}

