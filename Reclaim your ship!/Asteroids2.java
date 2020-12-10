import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroids2 extends Enemies
{
    /**
     * Act - do whatever the Asteroid2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy();
        removeEnemy();
    }    
}