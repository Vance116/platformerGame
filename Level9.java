import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class END here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level9 extends World
{

    /**
     * Constructor for objects of class END.
     * 
     */
    public Level9()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Gary Gary = new Gary();
        addObject(Gary, 24, 582);
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
        addObject(new MovingP1(), 919, 527);
        addObject(new MovingP1(), 81, 450);
        addObject(new MovingP1(), 919, 373);
        addObject(new MovingP1(), 81, 296);
        addObject(new MovingP1(), 919, 219);
        addObject(new MovingP1(), 81, 142);
        addObject(new MovingP1(), 81, 142);
        addObject(new PlatformL1(), 500, 67);
        
        showText("You finally felt you were nearing the treasure, as if it we around the next corner", 500, 450);
    }
}
