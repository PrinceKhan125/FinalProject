import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space1 extends World
{   
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    public Space1()
    {    
        super(600, 400, 1);
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    public HealthBar getHealthBar()
    {
        return healthbar;
    }

    public void act()
    {
        addAlien1();
        addAlien2();
        addAsteroid();
    }

    public void addAlien1()
    {
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new Alien1(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    public void addAlien2()
    {
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            addObject(new Alien2(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    public void addAsteroid()
    {
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Asteroids(), 599, Greenfoot.getRandomNumber(400));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter,70,25);
        addObject(healthbar,549,20);
        Astronaut astronaut = new Astronaut();
        addObject(astronaut,38,220);
    }
}