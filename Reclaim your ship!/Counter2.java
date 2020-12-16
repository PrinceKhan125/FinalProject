import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter2 extends Actor
{
    int score2 = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter2() 
    {
        setImage(new GreenfootImage ("Score: " + score2,40,Color.BLUE,Color.BLACK));
    }

    public void act()
    {
        setImage(new GreenfootImage ("Score: " + score2,40,Color.BLUE,Color.BLACK));
        YouWin();
    }

    public void addScore()
    {
        score2++;
    }

    public void YouWin()
    {
        if (score2 == 35)
        {
            getWorld().addObject(new YouWin(),300, 200);
            Greenfoot.delay(200);
            Greenfoot.setWorld(new CutScene());
        }
    }
}