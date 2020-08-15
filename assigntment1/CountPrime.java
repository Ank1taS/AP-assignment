/* to count total prime number from 10 to 1000
 file name  - CountPrime.java
 date       - 21/07/2020
*/

class CountPrime
{
    public static void main (String ar[])
    {
        
        int cprime = 0;

        for(int num = 10; num <= 1000; ++num)
        {
            int cdivisor = 0;
            for(int i = 2; i <= num ; ++i)
            {
                if(num % i == 0)
                    ++cdivisor;
            }

            if(cdivisor == 1)
                ++cprime ;
        }
        System.out.println("total numbers of prime numbers present from 10 to 1000 are " + cprime +".\n");
    }
    
}