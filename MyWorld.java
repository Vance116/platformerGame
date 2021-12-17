import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);  Platform1 Platform1 = new Platform1();
        addObject(Platform1, 75, 598 );
        addObject(new Platform1(), 175, 598 );
        addObject(new Platform1(), 275, 598 );
        addObject(new Platform1(), 375, 598 );
        addObject(new Platform1(), 475, 598 );
        addObject(new Platform1(), 575, 598 );
        addObject(new Platform1(), 675, 598 );
        addObject(new Platform1(), 775, 598 );
        addObject(new Platform1(), 875, 598 );
        addObject(new Platform1(), 975, 598 );
        addObject(new Platform2(), 498, 508 );
        addObject(new Platform2(), 630, 545 );
        addObject(new Platform2(), 366, 545 );

        addObject(new start(), 500, 350);
        Gary Gary = new Gary();
        addObject(Gary, 498, 582);
        
        showText("Your name is Gary", 500 , 110);
        showText("Beat all the levels to find the treasure", 500 , 130);
        showText("Touch the start button to begin", 500 , 150);
        showText("-Red platforms take you to the next level", 500 , 170);
        showText("-Holding the shift button and touching blue platforms teleport you", 500 , 190);
        showText("-Dont touch Lava", 500 , 210);
    }
}
