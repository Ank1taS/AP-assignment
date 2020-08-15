/*  programe name   : to swap 2 integer numbers
    file name       : Swap1.java
*/
    
import java.util.Scanner;


class NumClass1
{
    int num;
    NumClass1(int val)
    {
        num = val;
    }
    void show()
    {
        System.out.println("num1 value is :\t" +num);
    }
}

class NumClass2
{
    int num;
    NumClass2(int val)
    {
        num = val;
    }
    void show()
    {
        System.out.println("num2 value is :\t" +num);
    }
}


public class Swap1
{
    void swap(NumClass1 temp1, NumClass2 temp2)
    {
        int temp3 = temp1.num;
        temp1.num = temp2.num;
        temp2.num = temp3;
    }
  
    public static void main(String [] arr)
    {
        int value1, value2;

        Scanner inputobj = new Scanner(System.in);

        System.out.print("Enter the value of num1 - \t");
        value1 = inputobj.nextInt();
        NumClass1 obj1 = new NumClass1(value1);

        System.out.print("Enter the value of num2 - \t");
        value2 = inputobj.nextInt();
        NumClass2 obj2 = new NumClass2(value2);

        System.out.println("\n----BEFORE SWAPPING----");
        obj1.show();
        obj2.show(); 

        Swap1 obj3 = new Swap1();
        obj3.swap(obj1, obj2);

        System.out.println("\n----AFTER SWAPPING----");
        obj1.show();
        obj2.show(); 

        inputobj.close();

    }
}