import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    private GreenfootSound soundtrack = new GreenfootSound("Epic-Music.mp3");
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void started()
    {
        //soundtrack.play(); 
    }

    public void stopped()
    {
        soundtrack.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("logo.png");
        Picture logoPic = new Picture(logo);
        addObject(logoPic,getWidth()/2,100);
        Play play = new Play();
        addObject(play,318,205);
        play.setLocation(71,267);
        removeObject(play);
        addObject(play,138,291);
        play.setLocation(40,242);
        play.setLocation(38,243);
        play.setLocation(43,217);
        removeObject(play);
        addObject(play,297,159);
        play.setLocation(300,200);
        Instructions instructions = new Instructions();
        addObject(instructions,64,368);
        instructions.setLocation(122,367);
        Exit exit = new Exit();
        addObject(exit,567,367);
        Credits credits = new Credits();
        addObject(credits,120,330);
    }
}