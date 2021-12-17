import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatformL1 extends Platform1
{
    /**
     * Act - do whatever the PlatformL1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        level();
    }

    public void level()//was looking through games on greenfoot and discovered instanceof
    //took awhile but I figured it out
    {
        if (isTouching(Gary.class) && getWorld() instanceof Level1)
        {
            Greenfoot.setWorld(new Level2());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level2)
        {
            Greenfoot.setWorld(new Level3());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level3)
        {
            Greenfoot.setWorld(new Level4());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level4)
        {
            Greenfoot.setWorld(new Level5());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level7)
        {
            Greenfoot.setWorld(new Level8());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level8)
        {
            Greenfoot.setWorld(new Level9());
        }
        if (isTouching(Gary.class) && getWorld() instanceof Level9)
        {
            Greenfoot.setWorld(new Level10());
        }
    }
}
