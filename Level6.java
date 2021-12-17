import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Gary Gary = new Gary();
        addObject(Gary, 525, 0);
        addObject(new LavaP1(), 375, 598 );
        addObject(new LavaP1(), 375, 550 );
        addObject(new LavaP1(), 375, 500 );
        addObject(new LavaP1(), 375, 450 );
        addObject(new LavaP1(), 375, 400 );
        addObject(new LavaP1(), 375, 350 );
        addObject(new LavaP1(), 375, 300 );
        addObject(new LavaP1(), 375, 250 );
        addObject(new LavaP1(), 375, 200 );
        addObject(new LavaP1(), 375, 150 );
        addObject(new LavaP1(), 375, 100 );
        addObject(new LavaP1(), 375, 50 );
        addObject(new LavaP1(), 375, 0 );
        addObject(new LavaP1(), 675, 598 );
        addObject(new LavaP1(), 675, 550 );
        addObject(new LavaP1(), 675, 500 );
        addObject(new LavaP1(), 675, 450 );
        addObject(new LavaP1(), 675, 400 );
        addObject(new LavaP1(), 675, 350 );
        addObject(new LavaP1(), 675, 300 );
        addObject(new LavaP1(), 675, 250 );
        addObject(new LavaP1(), 675, 200 );
        addObject(new LavaP1(), 675, 150 );
        addObject(new LavaP1(), 675, 100 );
        addObject(new LavaP1(), 675, 50 );
        addObject(new LavaP1(), 675, 0 );
    }
}
