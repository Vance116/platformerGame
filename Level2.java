import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Platform1 Platform1 = new Platform1();
        addObject(Platform1, 75, 598 );
        Gary Gary = new Gary();
        addObject(Gary, 24, 582);
        addObject(new Platform1(), 175, 598 );
        addObject(new Platform1(), 275, 598 );
        addObject(new Platform1(), 375, 598 );
        addObject(new Platform1(), 475, 598 );
        addObject(new Platform1(), 575, 598 );
        addObject(new Platform1(), 675, 598 );
        addObject(new Platform1(), 775, 598 );
        addObject(new Platform1(), 875, 598 );
        addObject(new Platform1(), 975, 598 );
        addObject(new Platform1(), 233, 135 );
        addObject(new Platform2(), 125, 550 );
        addObject(new Platform2(), 250, 520 );
        addObject(new Platform2(), 375, 490 );
        addObject(new Platform2(), 500, 460 );
        addObject(new Platform2(), 625, 430 ); 
        addObject(new Platform2(), 750, 400 );
        addObject(new TeleP1(), 875, 400);
        addObject(new TeleP1(), 76, 108);
        addObject(new PlatformL1(), 415, 135);

        showText("You found yourself in a forest Magically Teleporting", 300, 300);
    }
}
