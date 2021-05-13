import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (Thane Hudelson) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int Segments;
    public Player()
    {
        Segments = 0;
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        Turn();
        eatApples();
        touchWall();
        touchBody();
    }
    
    public void Turn()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    }
    
    public void eatApples()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            Segments = Segments + 2;
        }
        
        if(isTouching(poisonApple.class))
        {
            removeTouching(poisonApple.class);
            Segments = Segments -3;
            if( Segments < 0)
            {
                Greenfoot.stop();
            }
        }
    }
    
    public void touchWall()
    {
        if(isTouching(Wall.class))
        {
            Greenfoot.stop();
        }
    }
    
    public void touchBody()
    {
        if( isTouching(snakeBody.class))
        {
            Greenfoot.stop();
        }
    }
}
