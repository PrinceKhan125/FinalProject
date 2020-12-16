import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astronaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronaut extends Actor
{
    boolean canFire = true;

    private GreenfootImage run1 = new GreenfootImage("Run1.png");
    private GreenfootImage run2 = new GreenfootImage("Run2.png");
    private GreenfootImage fly1 = new GreenfootImage("Fly1.png");
    private GreenfootImage fly2 = new GreenfootImage("Fly2.png");
    private GreenfootImage fly3 = new GreenfootImage("Fly3.png");
    private GreenfootImage down = new GreenfootImage("Down.png");
    private int frame = 1;
    private int altframe =1;
    private int lastframe =1;
    private int animationCounter = 0;
    private int altAnimationCounter = 0;
    /**
     * Act - do whatever the Astronaut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        fireProjectile();
        hitAsteroids();
        hitAsteroids2();
        animationCounter ++;
        altAnimationCounter ++;
        EnterShip();
    }

    public void moveAround()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
            if (animationCounter % 10 == 0)
            {
                animate();
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
            if (animationCounter % 10 == 0)
            { 
                animate();
            }
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
            if (altAnimationCounter % 10 == 0)
            {
                animateAlt();
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
            goingDown();
        }
    }

    public void fireProjectile()
    {
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Projectile(),getX(), getY()-10);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }

    public void hitAsteroids()
    {
        if(isTouching(Asteroids.class))
        {
            Space1 space1 = (Space1)getWorld();
            HealthBar healthbar = space1.getHealthBar();
            healthbar.health--;
        }
    }

    public void hitAsteroids2()
    {
        if(isTouching(Asteroids2.class))
        {
            Space2 space2 = (Space2)getWorld();
            HealthBar healthbar = space2.getHealthBar();
            healthbar.health--;
        } 
    }

    public void EnterShip()
    {
        if(isTouching(SpaceShip.class))
        {
            Greenfoot.setWorld(new FinalBoss());
        }
    }

    public void animate()
    {
        if (frame == 1)
        {
            setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run2);
            frame =1;
            return;
        }
        frame ++;
    }

    public void animateAlt()
    {
        if (altframe ==1)
        {
            setImage(fly1);
        }
        else if(altframe ==2)
        {
            setImage(fly2);
        }
        else if(altframe ==3)
        {
            setImage(fly3);
            altframe =1;
            return;
        }
        altframe ++;
    }

    public void goingDown()
    {
        if (lastframe ==1)
        {
            setImage(down);
            lastframe =1;
            return;
        }
    }
}