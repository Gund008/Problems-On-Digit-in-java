import java.lang.*;
import java.util.*;
///////////////////////////////////////////////////////////////////////////////////////////////
/*
Function Name:Factor
Description:Accept input from user and Display Digit is Revrse
Input:Integer
Output:Integer
Auther:Sukanya
Date:11/11/2022
*/

//////////////////////////////////////////////////////////////////////////////////////////////
class Digit  
{
   void Count(int iNo)
   {
      int iDigit=0;
      while(iNo!=0)
      {
        iDigit=iNo % 10;
        System.out.println(""+iDigit);
        iNo=iNo / 10;
      }
   }
}

//////////////////////////////////////////////////////////////////////////////////////////////
class DisplayDigit
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          dobj.Count(iValue);

    }
}