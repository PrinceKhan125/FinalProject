import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    public FinalBoss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
       public HealthBar getHealthBar()
    {
        return healthbar;
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DarkAstronaut darkAstronaut = new DarkAstronaut();
        addObject(darkAstronaut,559,221);
        addObject(healthbar,550,25);
        Astronaut astronaut = new Astronaut();
        addObject(astronaut,33,212);
        addObject(counter,75,370);
    }
}