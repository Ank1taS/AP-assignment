/* to find gcd and lcm of 2 numbers.
  file name - GcdLcm.java
  date      - 21/ 07/ 2020
*/

public class GcdLcm
{
    public static void main(String arr[])
    {
        int a = 90 , b = 22;
        int n1, n2;
        
        n1 = a;
        n2 = b;

        if (n1 != n2)
        {
            if(n2 > n1)
            {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            
            int rem;
            
             do
            {
                rem = n1 % n2;
                n1 = n2;
                n2 = rem;
            }while(rem != 0);

            System.out.println("GCD of " + a + "and" + b + "is =  " + n1 + "\n");
            System.out.println("LCM of " + a + "and" + b + "is =  " + (a * b) / n1 + "\n");
        }
    }
    
}