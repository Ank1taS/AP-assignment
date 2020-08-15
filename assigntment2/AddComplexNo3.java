//import java.util.Scanner;

/*  programe name   - to add 2 complex number(using 2 difference class and consructor) 
    file name       - AddComplexNo1.java
    date            - 27/07/2020
*/

class Complex
{
    float real;

    float imaginary;

    Complex(float n1,  float n2)
    {
        real = n1;
        imaginary = n2;
    }

    Complex(Complex obj1, Complex obj2 )
    {
        real = obj1.real + obj2.real;
        imaginary = obj1.imaginary + obj2.imaginary;

    //    System.out.println(x);
    System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +real+ " + " +imaginary+ "i" );
 
    }

}

class AddComplexNo3 
{
    public static void main(String [] arr)
    {
        Complex obj1 = new Complex(10.5F, 20.3F);

        Complex obj2 = new Complex(5.6F, 10);

        Complex obj3 = new Complex(obj1, obj2);

        System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +obj3.real+ " + " +obj3.imaginary+ "i" );

    }
}
