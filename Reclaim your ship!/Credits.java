import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Buttons
{
    public Credits()
    {
        GreenfootImage credits = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true,false,50);
        credits.setFont(adjustedFont);
        credits.setColor(Color.YELLOW);
        credits.drawString("Credits",0,50);
        setImage(credits);
    }

    public void act() 
    {
        checkMouse();
        checkClick(new Credit()); 
    }    
}