/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug
{
    private int position, change;
    
    public Bug(int initialPosition)
    {
        position = initialPosition;
        change = 1;
    }
    
    public void turn()
    {
        change = -change;
    }
    
    public void move()
    {
        this.position += change;
    }
    
    public int getPosition()
    {
        return this.position;
    }
}
