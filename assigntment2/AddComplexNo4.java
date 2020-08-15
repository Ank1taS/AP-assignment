/*  programe name   - to add 2 complex number(using 2 difference class and consructor) while taking runtime input
    file name       - AddComplexNo4.java
    date            - 27/07/2020
*/
import java.util.Scanner;

class ComplexNum
{
    float real;

    float imaginary;

    ComplexNum(float n1, float n2)
    {
        real = n1;
        imaginary = n2;
    }

    ComplexNum(ComplexNum obj1, ComplexNum obj2 )
    {
        real = obj1.real + obj2.real;
        imaginary = obj1.imaginary + obj2.imaginary;

    //    System.out.println(x);
    System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +real+ " + " +imaginary+ "i" );
 
    }

}

class AddComplexNo4 
{
    public static void main(String [] arr)
    {
        float val1, val2;

        Scanner inputobj = new Scanner (System.in);

        System.out.print("Enter the real part of the complex number1 :\t");
        val1 = inputobj.nextFloat();
        System.out.print("Enter the imaginary part of the complex number1 :\t");
        val2 = inputobj.nextFloat();
        ComplexNum obj1 = new ComplexNum(val1, val2);

        System.out.print("Enter the real part of the complex number2 :\t");
        val1 = inputobj.nextFloat();
        System.out.print("Enter the imaginary part of the complex number2 :\t");
        val2 = inputobj.nextFloat();
        ComplexNum obj2 = new ComplexNum(val1, val2);

        ComplexNum obj3 = new ComplexNum(obj1, obj2);

        System.out.println("Result of addition of complex number-1  " +obj1.real+ " + " +obj1.imaginary+ "i  and  complex number2 "+obj2.real+ " + " +obj2.imaginary+ "i  is =" +obj3.real+ " + " +obj3.imaginary+ "i" );

        inputobj.close();
    }
}
