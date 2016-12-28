/**
 * Write a description of class BugTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BugTester
{
    public static void main(String[] args)
    {
        Bug bugsy = new Bug(10);
        bugsy.move();
        System.out.println("The position of the bug after the change is: " + bugsy.getPosition());
        bugsy.turn();
        bugsy.move();
        System.out.println("The position of the bug after the change is: " + bugsy.getPosition());
    }
}
