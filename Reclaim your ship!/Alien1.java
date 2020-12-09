import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien1 extends Enemies
{
    /**
     * Act - do whatever the Alien1 wants to do. This method is called whenever
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
            Space1 space1 = (Space1)world;
            Counter counter = space1.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getX() == 0)
        {
            World world = getWorld();
            Space1 space1 = (Space1) world;
            HealthBar healthbar = space1.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}