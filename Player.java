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
    int count;
    public boolean worldChange1;
    public boolean worldChange2;
    public Player()
    {
        setRotation(270);
        Segments = 0;
        numberOfApples = 0;
        worldChange1 = false;
        worldChange2 = false;
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        count++;
        getWorld().addObject(new snakeBody(), getX(), getY());
        move(3);
        Turn();
        eatApples();
        touchWall();
        //touchBody();
        makeApples();
        showScore();
        changeWorld();
        changeWorld2();
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
    
    public void eatApples()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            Segments = Segments + 1;
            numberOfApples = numberOfApples - 1;
            int segmentX = getX();
            int segmentY = getY();
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
    
    public void touchWall()
    {
        if(isTouching(Wall.class))
        {
            Greenfoot.stop();
        }
        
        if(isAtEdge())
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
        if( worldChange1 == false && worldChange2 == false)
        {
            getWorld().showText("Score: " + Segments,140, 675 );
        }
        
        if( worldChange1 == true && worldChange2 == false)
        {
            getWorld().showText("Score: " + Segments, 75, 575 );
        }
        
        if( worldChange1 == true && worldChange2 == true)
        {
            getWorld().showText("Score: " + Segments, 50, 375 );
        }
    }
    
    public void changeWorld()
    {
        if( Segments >= 15 && worldChange1 == false)
        {
            worldChange1 = true;
            Greenfoot.setWorld(new SnakeWorld2(this));
        }
    }

    public void changeWorld2()
    {
        if( Segments >= 30 && worldChange2 == false)
        {
            worldChange2 = true;
            Greenfoot.setWorld(new SnakeWorld3(this));
        }
    }
}
