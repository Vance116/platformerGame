import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingP1 extends Platform1

{
    private int dx = 3;
    /**
     * Act - do whatever the MovingP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        bounce();
    }

    public void move()//Had to look at pong, pretty much the same code from the ball
    {
        setLocation(getX() + dx, getY() + 0);
    }

    public void bounce()
    {
        if(getX() > getWorld().getWidth() - 81 )
        {
            dx = -dx;
        }
        if(getX() < getWorld().getWidth() - 919 )
        {
            dx = -dx;
        }
    }
}
