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
        GreenfootImage myTitle = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,40);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.MAGENTA);
        myTitle.drawString("Back",0,50);
        setImage(myTitle);  
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