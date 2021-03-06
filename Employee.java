/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.*;
public class Employee
{
    private String name;
    private double salary;
    
    public Employee (String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * (byPercent / 100);
        this.salary += raise;
    }
    
    public String getName()
    {
        System.out.println("Name: " + name);
        return name;
    }
    
    public double getSalary()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Salary: " + fmt.format(salary));
        return salary;
    }
}
