import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld3 extends World
{

    /**
     * Constructor for objects of class SnakeWorld3.
     * 
     */
    public SnakeWorld3(Player snake)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        addObject( snake, 200, 200);
    }
}
