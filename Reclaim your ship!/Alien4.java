import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien4 extends Enemies
{
    int timesHit = 3;
    /**
     * Act - do whatever the Alien4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy();
        hitByProjectile2();
    }
        public void hitByProjectile2()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            Space2 space2 = (Space2) world;
            Counter counter = space2.getCounter();
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
            Space2 space2 = (Space2) world;
            HealthBar healthbar = space2.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
