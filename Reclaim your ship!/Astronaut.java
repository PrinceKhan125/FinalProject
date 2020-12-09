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
    /**
     * Act - do whatever the Astronaut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        fireProjectile();
        hitAsteroids();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
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
}