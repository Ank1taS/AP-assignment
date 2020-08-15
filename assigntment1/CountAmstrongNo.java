/* To count total numbers of amstrong nymbers present betweet 10 to 100 .
   file name    - CountAmstrongNo.java
   date         - 21/7/2020
*/

class CountAmstrongNo 
{
    public static void main(String arg[])
    {
        int count = 0;
        int rem ;

        for(int i = 10; i <= 100; ++i)
        {
            int sum = 0, num = i;
            while(num != 0)
            {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == i)
                ++count;
        }

        System.out.println("There are " + count + "amstrong numbers present between 10 to 100 \n");
    }        
            
    
}