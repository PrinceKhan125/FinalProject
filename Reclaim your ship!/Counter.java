import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter() 
    {
        setImage(new GreenfootImage ("Score: " + score,40,Color.BLUE,Color.BLACK));
    }

    public void act()
    {
        setImage(new GreenfootImage ("Score: " + score,40,Color.BLUE,Color.BLACK));
        YouWin();
    }

    public void addScore()
    {
        score++;
    }

    public void YouWin()
    {
        if(score == 20)
        {
            getWorld().addObject(new YouWin(),300, 200);
            Greenfoot.delay(200);
            Greenfoot.setWorld(new Space2());
        }
        if (score == 35)
        {
            getWorld().addObject(new YouWin(),300, 200);
            Greenfoot.setWorld(new CutScene());
        }
    }
}