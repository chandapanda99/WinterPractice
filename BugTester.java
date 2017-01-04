/**
 * Write a description of class BugTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class BugTester
{
    public static void main(String[] args)
    {
        Bug bugsy = new Bug(0);
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("Initial position is: " + bugsy.getPosition());
        
        System.out.println("Pick a choice");
        System.out.println("1. Move\n2. Turn\n3. Exit Program");
        int choice = Keyboard.nextInt();
        
        while (choice != 3)
        {
            if (choice == 1)
            {
                bugsy.move();
                System.out.println("The position of the bug is: " + bugsy.getPosition());
            }
            else if (choice == 2)
            {
                bugsy.turn();
                System.out.println("The position of the bug is still: " + bugsy.getPosition());
            }
            System.out.println("Pick a choice");
            System.out.println("1. Move\n2. Turn\n3. Exit Program");
            choice = Keyboard.nextInt();
        }
    }
}

/*
 * Sample Output
 * 
 * Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: -3
Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: -4
Pick a choice
1. Move
2. Turn
3. Exit Program
2
The position of the bug is still: -4
Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: -3
Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: -2
Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: -1
Pick a choice
1. Move
2. Turn
3. Exit Program
1
The position of the bug is: 0
Pick a choice
1. Move
2. Turn
3. Exit Program
3

 */