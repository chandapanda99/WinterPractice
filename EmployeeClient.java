/**
 * Write a description of class EmployeeClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeClient
{
    public static void main(String[] args)
    {
        Employee aayush = new Employee("Aayush Chanda", 50000);
        
        aayush.getName();
        System.out.println("Before Raise");
        aayush.getSalary();
        System.out.println("After Raise");
        aayush.raiseSalary(0.50);
        aayush.getSalary();
    }
}
