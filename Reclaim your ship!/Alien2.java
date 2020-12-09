import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Enemies
{
    int timesHit = 2;
    /**
     * Act - do whatever the Alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy();
        hitByProjectile();
    }

    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            Space1 space1 = (Space1) world;
            Counter counter = space1.getCounter();
            counter.addScore();
            timesHit--;
        }
        if (timesHit == 0)
        {
            getWorld().removeObject(this);
        }
        else if (getX() == 0)
        {
            World world = getWorld(); 
            Space1 space1 = (Space1) world;
            HealthBar healthbar = space1.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}