/*  To find the factorial of a number
    file name   - Factorial.java
    date        - 21/07/2020
*/

class Factorial
{
    public static void main( String arr[])
    {
        int num ;
        int i;
        int fac = 1;

        num = i = 14;

        while(i != 0)
        {
            fac *= i;
            --i;
        }

        System.out.println("the factorial of " + num + " is " + fac + "\n");
    }
}