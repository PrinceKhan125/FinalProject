import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Buttons
{
    public Exit()
    {
        GreenfootImage exit = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,40);
        exit.setFont(adjustedFont);
        exit.setColor(Color.BLACK);
        exit.drawString("Exit",0,50);
        setImage(exit); 
    }

    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    } 
}