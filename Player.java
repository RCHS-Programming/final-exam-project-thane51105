import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (Thane Hudelson) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int Segments;
    public int numberOfApples;
    public int numberOfPoison;
    public Player()
    {
        Segments = 0;
        numberOfApples = 0;
        numberOfPoison = 0;
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
        makeApples();
        makePoison();
        showScore();
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
            Segments = Segments + 1;
            numberOfApples = numberOfApples - 1;
            int segmentX = getX();
            int segmentY = getY();
            getWorld().addObject( new snakeBody(), segmentX + 75, segmentY);
        }
        
        if(isTouching(poisonApple.class))
        {
            removeTouching(poisonApple.class);
            Segments = Segments -1;
            numberOfPoison = numberOfPoison - 1;
            if( Segments < 0)
            {
                Greenfoot.stop();
            }
        }
    }
    
    public void makeApples()
    {
        if( numberOfApples < 1)
        {
           int x = Greenfoot.getRandomNumber(600) + 100;
           int y = Greenfoot.getRandomNumber(600) + 100;
           getWorld().addObject( new Apple(), x, y);
           numberOfApples = numberOfApples + 1;
        }
    }
    
    public void makePoison()
    {
       if( numberOfPoison < 1)
        {
           int x = Greenfoot.getRandomNumber(600) + 100;
           int y = Greenfoot.getRandomNumber(600) + 100;
           getWorld().addObject( new poisonApple(), x, y);
           numberOfPoison = numberOfPoison + 1;
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
    
    public void showScore()
    {
        getWorld().showText("Score: ",140, 675 );
    }
}
