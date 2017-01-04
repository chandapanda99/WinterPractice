/**
 * Write a description of class EmployeeClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class EmployeeClient
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("Enter Employee name: ");
        String employeeName = Keyboard.nextLine();
        System.out.println("Enter Employee starting salary: ");
        double currentSalary = Keyboard.nextDouble();
        System.out.println("Enter raise factor (in percent): ");
        double byPercent = Keyboard.nextDouble();
        
        Employee emp = new Employee(employeeName, currentSalary);
        
        emp.getName();
        System.out.println("Before Raise");
        emp.getSalary();
        System.out.println("After Raise");
        emp.raiseSalary(byPercent);
        emp.getSalary();
    }
}

/*
 * Sample Output
 * 
 * Enter Employee name: 
Aayush Chanda
Enter Employee starting salary: 
100000
Enter raise factor (in percent): 
50
Name: Aayush Chanda
Before Raise
Salary: $100,000.00
After Raise
Salary: $150,000.00
 */