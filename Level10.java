import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level10 extends World
{

    /**
     * Constructor for objects of class Level10.
     * 
     */
    public Level10()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Gary Gary = new Gary();
        addObject(Gary, 500, 300);
        addObject(new Platform1(), 75, 598 );
        addObject(new Platform1(), 175, 598 );
        addObject(new Platform1(), 275, 598 );
        addObject(new Platform1(), 375, 598 );
        addObject(new Platform1(), 475, 598 );
        addObject(new Platform1(), 575, 598 );
        addObject(new Platform1(), 675, 598 );
        addObject(new Platform1(), 775, 598 );
        addObject(new Platform1(), 875, 598 );
        addObject(new Platform1(), 975, 598 );
        showText("You found the Treasure!!!!!", 500, 300);
    }
}
