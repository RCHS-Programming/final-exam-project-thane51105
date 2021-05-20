import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snakeBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snakeBody extends Actor
{
    int Count = 0;
    int countLength = 0;
    /**
     * Act - do whatever the snakeBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Count++;
        if (Count > 60)
        getWorld().removeObject(this);
        //Turn();
        //move(3);
    }    
    
        public void Turn()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
    }
}
