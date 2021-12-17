import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Gary Gary = new Gary();
        Platform1 Platform1 = new Platform1();
        TeleP1 TeleP1 = new TeleP1();
        addObject(Platform1, 75, 598 );
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
        addObject(new Platform2(), 125, 525 );
        addObject(new Platform2(), 250, 490 );
        addObject(new Platform2(), 375, 465 );
        addObject(new Platform2(), 500, 440 );
        addObject(new Platform2(), 625, 415 ); 
        addObject(new Platform2(), 750, 390 );
        addObject(new PlatformL1(), 875, 375 );
        showText("You made your way through a mystical swamp", 500, 130);
    }
}
