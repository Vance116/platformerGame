import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gary extends Actor
{
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = -12;
    private int dx = 4;
    private int counter = 0;

    GreenfootImage[] walkRight = new GreenfootImage[8];
    GreenfootImage[] walkLeft = new GreenfootImage[8];
    private int animCounter = 0;

    public Gary()
    {
        initAnimationSprites();
    }

    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        teleP();
        touchingLava();
        level();
    }

    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            animateRunRight();
        }

        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            animateRunLeft();
        } 

        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
        
        if (Greenfoot.isKeyDown("up") && onGround())
        {
            jump();
        }


    }

    public void moveRight()
    {
        setLocation (getX() + speed, getY());

    }

    public void moveLeft()
    {
        setLocation (getX() - speed, getY());

    }

    public void fall()
    {
        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }

    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Platform1.class);
        return under != null;
    }

    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2 + i, Platform1.class);   
            if (under != null)
            {
                vSpeed = i;
            }
        }
    }

    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }

    public void jump()
    {
        vSpeed = jumpStrength;
        fall();
    }

    private void teleP()
    {
        if(Greenfoot.isKeyDown("shift") && isTouching(TeleP1.class) && getWorld() instanceof Level2 )
        {
            setLocation (74, 90);

        } 
        if(Greenfoot.isKeyDown("shift") && isTouching(TeleP1.class) && getX()> 500 )
        {
            setLocation (541, 60);
        } 
        if(Greenfoot.isKeyDown("shift") && isTouching(TeleP1.class))
        {
            setLocation (50, 548);
        } 
        if(Greenfoot.isKeyDown("shift") && isTouching(TeleP1.class))
        {
            setLocation (48, 551);
        }
    }
    private void touchingLava()
    {
        if(isTouching(LavaP1.class) && getWorld() instanceof Level3)
        {
            Greenfoot.playSound("Explosion21.wav");
            setLocation (24, 582);
        }
        if(isTouching(LavaP1.class) && getWorld() instanceof Level4)
        {
            Greenfoot.playSound("Explosion21.wav");
            setLocation (37, 70);
        }
        if(isTouching(LavaP1.class) && getWorld() instanceof Level5)
        {
            Greenfoot.playSound("Explosion21.wav");
            setLocation (37, 70);
        }
        if(isTouching(LavaP1.class) && getWorld() instanceof Level8)
        {
            Greenfoot.playSound("Explosion21.wav");
            setLocation (24, 582);
        }
        if(isTouching(LavaP1.class) && getWorld() instanceof Level7 )
        {
            Greenfoot.playSound("Explosion21.wav");
            setLocation (525, 583);
        }
    }
    
    private void level()
    {
        if(isTouching(start.class) && getWorld() instanceof MyWorld)
        {
            Greenfoot.setWorld(new Level1());
            Greenfoot.playSound("song.mp3");
        }

        if(isAtEdge() && getY() > 511 && getWorld() instanceof Level5)
        {
            Greenfoot.setWorld(new Level6());
        }
        if(isAtEdge() && getY() > 511 && getWorld() instanceof Level6)
        {
            Greenfoot.setWorld(new Level7());
        }
        if(isAtEdge() && getY() >= 599 && getWorld() instanceof Level7)
        {
            Greenfoot.setWorld(new secretLevel());
        }
        if(Greenfoot.isKeyDown("space") && getWorld() instanceof secretLevel)
        {
            Greenfoot.setWorld(new Level8());
        }
    }

    public void initAnimationSprites(){
        for (int i = 0; i < 8; i++)
        {
            String filename = "cube" + i + ".png";
            walkRight[i] = new GreenfootImage(filename);
        }

        for (int i = 0; i < 8; i++)
        {
            String filename = "cube" + i + ".png";
            walkLeft[i] = new GreenfootImage(filename);
            walkLeft[i].mirrorHorizontally();
        }
    }

    public void animateRunRight()
    {
        setImage(walkRight[animCounter++ % 8]);
    }

    public void animateRunLeft()
    {
        setImage(walkLeft[animCounter++ % 8]);
    }
}
