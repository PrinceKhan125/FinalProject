import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DarkAstronaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DarkAstronaut extends Actor
{
    private GreenfootImage rrun1 = new GreenfootImage("RRun1.png");
    private GreenfootImage rrun2 = new GreenfootImage("RRun2.png");
    private int animationCounter2 = 0;
    private int frame2 = 1;
    int timesHit = 10;
    /**
     * Act - do whatever the DarkAstronaut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        turnAtEdge();
        randomTurn();
        lookForAstronaut();
        hitByProjectile();
        animationCounter2++;
        if (animationCounter2 % 10 == 0)
        {
            animation();
        }
    }

    public void turnAtEdge()
    {
        if (isAtEdge()) 
        {
            turn(8);
        }
    }

    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }

    public void lookForAstronaut()
    {
        if(isTouching(Astronaut.class))
        {
            FinalBoss finalboss = (FinalBoss)getWorld();
            HealthBar healthbar = finalboss.getHealthBar();
            healthbar.health--;
        } 
    }

    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            FinalBoss finalboss = (FinalBoss)world;
            Counter3 counter3 = finalboss.getCounter3();
            counter3.addScore();
            timesHit--;
        }
        if (timesHit == 0)
        {
            getWorld().removeObject(this);
        } 
    }

    public void animation()
    {
        if (frame2 == 1)
        {
            setImage(rrun1);
        }
        else if(frame2 == 2)
        {
            setImage(rrun2);
            frame2 =1;
            return;
        }
        frame2 ++;
    }
}