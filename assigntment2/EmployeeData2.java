import java.util.*;

class EmployeeClass
{
    String name;
    String id;
    int age;
    String department;
    float salary;

    EmployeeClass()
    {
        Scanner inputobj = new Scanner(System.in);
    
        System.out.print("Enter name \t:");
        name = inputobj.nextLine();
    
        System.out.print("Enter id \t:");
        id = inputobj.nextLine();
        
        System.out.print("Enter age \t:");
        age = inputobj.nextInt();
        
        System.out.print("Enter department \t:");
        inputobj.nextLine();
        department = inputobj.nextLine();
        
        System.out.print("Enter salary \t:");
        salary = inputobj.nextFloat();

        inputobj.close();
    }

    void show()
    {
        System.out.println("\n\t" +name+ "\t\t" +id+ "\t\t" +age+ "\t\t" +department+ "\t\t" +salary);
    }
}

class EmployeeData2
{
    public static void main(String []arr)
    {

        EmployeeClass obj1 = new EmployeeClass();
        
        System.out.println("\n\tname\t\tid\t\tage\t\tdepartment\t\tsalary\n\n");

        obj1.show();
    }
}