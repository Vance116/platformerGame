import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Platform1 Platform1 = new Platform1();
        Gary Gary = new Gary();
        addObject(Gary, 37, 70);
        addObject(new LavaP1(), 75, 598 );
        addObject(new LavaP1(), 175, 598 );
        addObject(new LavaP1(), 275, 598 );
        addObject(new LavaP1(), 375, 598 );
        addObject(new LavaP1(), 475, 598 );
        addObject(new LavaP1(), 575, 598 );
        addObject(new LavaP1(), 675, 598 );
        addObject(new LavaP1(), 775, 598 );
        addObject(new LavaP1(), 875, 598 );
        addObject(new LavaP1(), 975, 598 );
        addObject(new LavaP1(), 275, 509 );
        addObject(new LavaP1(), 425, 509 );
        addObject(new LavaP1(), 549, 110 );
        addObject(new Platform1(), 101, 90 );
        addObject(new Platform1(), 80, 385 );
        addObject(new Platform1(), 245, 385 );
        addObject(new Platform1(), 410, 385 );
        addObject(new Platform2(), 310, 162 );
        addObject(new Platform2(), 179, 507 );
        addObject(new Platform2(), 200, 507 );
        addObject(new Platform2(), 350, 507 );
        addObject(new Platform2(), 500, 507 );
        addObject(new Platform2(), 541, 75 );
        addObject(new TeleP1(), 136, 240);
        addObject(new TeleP1(), 49, 568);
        addObject(new TeleP1(), 670, 568);
        addObject(new LavaP1(), 80, 378 );
        addObject(new LavaP1(), 245, 378 );
        addObject(new LavaP1(), 410, 378 );
        addObject(new PlatformL1(), 760, 380 );
    }
}
