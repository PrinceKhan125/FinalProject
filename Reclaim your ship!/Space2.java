import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space2 extends World
{

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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,211,169);
        counter.setLocation(62,25);
    }
}