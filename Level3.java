import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Platform1 Platform1 = new Platform1();
        addObject(Platform1, 75, 598 );
        Gary Gary = new Gary();
        addObject(Gary, 24, 582);
        addObject(new Platform1(), 175, 598 );
        addObject(new Platform1(), 617, 398 );
        addObject(new LavaP1(), 275, 598 );
        addObject(new LavaP1(), 375, 598 );
        addObject(new LavaP1(), 475, 598 );
        addObject(new LavaP1(), 575, 598 );
        addObject(new LavaP1(), 675, 598 );
        addObject(new LavaP1(), 775, 598 );
        addObject(new LavaP1(), 875, 598 );
        addObject(new LavaP1(), 975, 598 );
        addObject(new Platform2(), 253, 557);
        addObject(new Platform2(), 400, 525);
        addObject(new Platform2(), 547, 493);
        addObject(new Platform2(), 425, 434);
        addObject(new PlatformL1(), 855, 572); 

        showText("You stumbled upon great Volcanoes, never before seen", 300, 300);

    }
}
