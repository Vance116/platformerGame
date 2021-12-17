import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
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
        addObject(new LavaP1(), 675, 598 );
        addObject(new LavaP1(), 775, 598 );
        addObject(new LavaP1(), 875, 598 );
        addObject(new LavaP1(), 975, 598 );
        addObject(new LavaP1(), 129, 95 );
        addObject(new LavaP1(), 293, 101 );
        addObject(new LavaP1(), 413, 317 );
        addObject(new LavaP1(), 646, 317 );
        addObject(new Platform1(), 79, 87 );
        addObject(new Platform2(), 249, 94 );
        addObject(new Platform2(), 414, 100 );   

    }
}
