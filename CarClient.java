/**
 * Write a description of class CarClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.*;
import java.util.*;
public class CarClient
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner Keyboard = new Scanner(System.in);
        
        Car lambo = new Car(30);
        System.out.println("Efficiency: " + lambo.getEfficiency() + " mpg");
        System.out.println("Initial Gas: " + lambo.gasLeft());
        System.out.println("How much gas should be added? ");
        double add = Keyboard.nextDouble();
        lambo.addGas(add);
        System.out.println("Gas in Tank: " + df.format(lambo.gasLeft()));
        System.out.println("How far will you drive (miles)? ");
        double mile = Keyboard.nextDouble();
        lambo.drive(mile);
        System.out.println("After driving: " + df.format(lambo.gasLeft()) + " gallons");
    }
}

/*
 * Sample Output
 * 
 * Efficiency: 30.0 mpg
Initial Gas: 0.0
How much gas should be added? 
50
Gas in Tank: 50
How far will you drive (miles)? 
120
After driving: 46 gallons

 */