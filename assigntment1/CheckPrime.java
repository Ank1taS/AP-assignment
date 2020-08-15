/*
programe name - to check a number prime or not
file name     - CheckPrime.java
date          - 20 07 2020
*/

class CheckPrime
{
    public static void main(String ar[])
    {
        int count = 0;
        System.out.println("let the number is 5 ");

        for(int i = 1; i <= 5; ++i)
        {
            if(5 % i == 0)
            {
                ++count;
            }
        }
        if (count == 2)
            System.out.println("5 is a prime number");
        else
            System.out.println("5 is not..");
    }
}