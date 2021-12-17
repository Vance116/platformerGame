import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level8 extends World
{

    /**
     * Constructor for objects of class Level8.
     * 
     */
    public Level8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Gary Gary = new Gary();
        addObject(new Gary(), 24, 582);
        addObject(new Platform1(), 75, 598 );
        addObject(new Platform1(), 875, 598 );
        addObject(new Platform1(), 975, 598 );
        addObject(new PlatformL1(), 902,589 );
        addObject(new MovingP1(), 919, 554);
        addObject(new LavaP1(), 239, 598 );
        addObject(new LavaP1(), 404, 598 );
        addObject(new LavaP1(), 566, 598 );
        addObject(new LavaP1(), 723, 598 );
        
        showText("You stopped at a town to take very much needed break", 500, 400);
    }
}
