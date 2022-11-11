import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
class Digit  
{
   int Count(int iNo)
   {
      int iDigit=0,iRev=0;
      while(iNo!=0)
      {
        iDigit=iNo % 10;
        iRev=(iRev * 10 )+iDigit;
        iNo=iNo / 10;
      }
      return iRev;
   }
}
////////////////////////////////////////////////////////////////////////////////////////////
class ReverseDigit
{
    public static void main(String[] args) 
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the number:");
          int iValue=sobj.nextInt();
          
          Digit dobj=new Digit();
          int iRet=dobj.Count(iValue);
          
          System.out.println("Revrse Digit:"+iRet);


    }
}