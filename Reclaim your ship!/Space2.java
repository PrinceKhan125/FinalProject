import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space2 extends World
{
    HealthBar healthbar = new HealthBar();
    Counter2 counter2 = new Counter2();
    /**
     * Constructor for objects of class Space2.
     * 
     */
    public Space2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public Counter2 getCounter2()
    {
        return counter2;
    }

    public HealthBar getHealthBar()
    {
        return healthbar;
    }

    public void act()
    {
        addAlien3();
        addAlien4();
        addAsteroid2();
    }

    public void addAlien3()
    {
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new Alien3(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    public void addAlien4()
    {
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new Alien4(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    public void addAsteroid2()
    {
        if (Greenfoot.getRandomNumber(400) < 1)
        {
            addObject(new Asteroids2(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter2,70,20);
        addObject(healthbar,200,20);
        Astronaut astronaut = new Astronaut();
        addObject(astronaut,40,200);
    }
}