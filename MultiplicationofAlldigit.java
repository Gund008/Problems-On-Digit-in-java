/*
write a Program which accept number from user and return Multiplication of all digits.
Input: 2395
Output :270

Input:1018
Output:8

Input:9440
Output:144

Input:922432
Output:864
*/

import java.lang.*;
import java.util.*;

class P2
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo=sobj.nextInt();

            MarevllousX aobj=new MarevllousX(iNo);
            int iRet=aobj.Multdigit();
            System.out.println("\t"+iRet);
      }
}
///////////////////////////////////////////////////////////////////////////////////////////////////

class MarevllousX
{
    public int iValue;

    public MarevllousX(int A)
    {
        this.iValue=A;
    }
    
    public int Multdigit()
    {
        int iDigit,iMult=1;

        while(iValue!=0)
        {
            iDigit=iValue % 10;
            if(iDigit==0)
            {
                iDigit=1;
            }
            iMult=iMult * iDigit;
            iValue=iValue / 10;
        }
        return iMult;
    }
}
