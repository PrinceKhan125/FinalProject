import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int PixelPerHealthPoint = (int)healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar() 
    {
        update();
    }

    public void act()
    {
        update();
        gameOver();
    }

    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.YELLOW);
        myImage.drawRect(0,0,healthBarWidth + 1,healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*PixelPerHealthPoint, healthBarHeight);
    }

    public void loseHealth()
    {
        health--;
    }

    public void gameOver()
    {
        if(health == 0)
        {
            getWorld().addObject (new GameOver(),300,200);
            Greenfoot.stop();
        }
    }
}