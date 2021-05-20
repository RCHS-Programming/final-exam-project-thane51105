import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld2 extends World
{

    /**
     * Constructor for objects of class SnakeWorld2.
     * 
     */
    public SnakeWorld2(Player snake)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject( snake, 300, 300);
    }
}
