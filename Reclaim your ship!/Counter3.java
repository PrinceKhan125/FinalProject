import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter3 extends Actor
{
    int score3 = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter3() 
    {
        setImage(new GreenfootImage ("Score: " + score3,40,Color.BLUE,Color.BLACK));
    }

    public void act()
    {
        setImage(new GreenfootImage ("Score: " + score3,40,Color.BLUE,Color.BLACK));
        YouWin();
    }

    public void addScore()
    {
        score3++;
    }

    public void YouWin()
    {
        if (score3 == 50)
        {
            getWorld().addObject(new YouWin(),300, 200);
            Greenfoot.delay(200);
        }
    }
}