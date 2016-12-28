/**
 * Write a description of class CarClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.*;
public class CarClient
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("###.###");
        
        Car lambo = new Car(100);
        
        lambo.addGas(20);
        System.out.println("Gas in Tank: " + df.format(lambo.gasLeft()));
        lambo.drive(20);
        System.out.println("After driving: " + df.format(lambo.gasLeft()));
    }
}
