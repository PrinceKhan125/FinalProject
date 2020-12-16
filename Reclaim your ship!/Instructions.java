import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage  instructions = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true,false,40);
        instructions.setFont(adjustedFont);
        instructions.setColor(Color.GREEN);
        instructions.drawString("Instructions",0,50);
        setImage(instructions);
    }

    public void act() 
    {
        checkMouse();
        checkClick(new InstructionsWorld());
    }    
}