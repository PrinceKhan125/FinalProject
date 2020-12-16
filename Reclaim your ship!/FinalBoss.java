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
    Counter3 counter3 = new Counter3();
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

    public Counter3 getCounter3()
    {
        return counter3;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        DarkAstronaut[] darkastronaut =  new DarkAstronaut[4];
        int i = 0;
        while (i < darkastronaut.length)
        {
            darkastronaut[i] =  new DarkAstronaut();
            int darkastronautX = Greenfoot.getRandomNumber(getWidth());
            int darkastronautY = Greenfoot.getRandomNumber(getHeight());
            addObject(darkastronaut[i], darkastronautX, darkastronautY);
            i = i + 1;
        }
        DarkAstronaut darkAstronaut = new DarkAstronaut();
        addObject(darkAstronaut,559,221);
        addObject(healthbar,550,25);
        Astronaut astronaut = new Astronaut();
        addObject(astronaut,33,212);
        addObject(counter3,75,370);
    }
}