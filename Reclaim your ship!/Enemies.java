import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    public void moveEnemy()
    {
        setLocation(getX()-2,getY());
    }

    public void removeEnemy()
    {
        if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}