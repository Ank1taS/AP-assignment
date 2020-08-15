//import java.util.Scanner;

/*  programe name   - to add 2 complex number(using a single class and consructor) 
    file name       - AddComplexNo1.java
    date            - 27/07/2020
*/

class AddComplexNo2 
{
    int real;
    int imaginary;

    AddComplexNo2(int n1, int n2)
    {
        real = n1;
        imaginary = n2;
    }

    AddComplexNo2(AddComplexNo2 obj1, AddComplexNo2 obj2 )
    {
        real = obj1.real + obj2.real;
        imaginary = obj1.imaginary + obj2.imaginary;

    //    System.out.println(x);
    System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +real+ " + " +imaginary+ "i" );
 
    }
    public static void main(String [] arr)
    {
        AddComplexNo2 obj1 = new AddComplexNo2(10, 20);

        AddComplexNo2 obj2 = new AddComplexNo2(5, 10);

        AddComplexNo2 obj3 = new AddComplexNo2(obj1, obj2);

        System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +obj3.real+ " + " +obj3.imaginary+ "i" );

    }
}
