import java.util.Scanner;

// Input : 79959
// Output : 3

/*
7+9+9+5+9       39

3 + 9           12

1 + 2            3

3
*/

class Digit
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the Number:");
        int iNo=sobj.nextInt();

        int iSum=0,iDigit=0;

       while(true)
        {
            while(iNo!=0)
            {
                iDigit=iNo % 10;
                iSum=iSum + iDigit;
                iNo=iNo / 10;
            }
            iNo=iSum;
            iSum=0;
            if(iNo < 10)
            {
                break;
            }
        }
        System.out.println(iNo);
    }
}
