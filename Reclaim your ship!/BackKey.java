import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackKey extends Buttons
{
    public BackKey()
    {
        GreenfootImage backKey = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,40);
        backKey.setFont(adjustedFont);
        backKey.setColor(Color.MAGENTA);
        backKey.drawString("Back",0,50);
        setImage(backKey);  
    }
    /**
     * Act - do whatever the BackKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        checkClick(new StartMenu());  
    }    
}