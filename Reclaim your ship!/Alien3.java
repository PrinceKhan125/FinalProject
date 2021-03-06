import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien3 extends Enemies
{
    /**
     * Act - do whatever the Alien3 wants to do. This method is called whenever
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
            Counter2 counter2 = space2.getCounter2();
            counter2.addScore();
            getWorld().removeObject(this);
        }
        else if (getX() == 0)
        {
            World world = getWorld();
            Space2 space2 = (Space2) world;
            HealthBar healthbar = space2.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}