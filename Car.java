/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    private double speed, consume, newgas, gas;
    
    public Car(double mpg)
    {
        speed = mpg;
        gas = 0;
    }
    
    public void addGas(double add)
    {
        this.gas += add;
    }
    
    public double gasLeft()
    {
        return this.gas;
    }
    
    public void drive(double mile)
    {
        consume = mile / this.speed;
        gas = this.gas - consume;
    }
}