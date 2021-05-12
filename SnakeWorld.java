import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeWorld here.
 * 
 * @author (Thane Hudelson) 
 * @version (a version number or a date)
 */
public class SnakeWorld extends World
{
    public boolean applesPresent;
    
    /**
     * Constructor for objects of class SnakeWorld.
     * 
     */
    public SnakeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        makeWalls();
        applesPresent = false;
        makeApples();
    }
    
    public void makeWalls()
    {
        for(int i = 0; i < 8; i++)
        {
            addObject( new Wall(), 50 + 100*i, 750);
        }
        
        for( int i = 0; i < 8; i++)
        {
            addObject( new Wall(), 50 + 0, 100*i);
        }
        
        for( int i = 0; i < 8; i++)
        {
            addObject( new Wall(), 50 + 700, 100*i);
        }
        
        for(int i = 0; i < 8; i++)
        {
            addObject( new Wall(), 50 + 100*i, 50);
        }
    }
    
    public void makeApples()
    {
        if( applesPresent == false)
        {
            int x = Greenfoot.getRandomNumber(550) + 120; 
            int y = Greenfoot.getRandomNumber(100) + 500;
            addObject( new Apple(), x, y);
            applesPresent = true;
        }
    }
    
}
