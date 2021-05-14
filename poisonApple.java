import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poisonApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poisonApple extends Actor
{
    /**
     * Act - do whatever the poisonApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     //   makeApples();
    }    
    
       public void makeApples()
   {
       if ( getWorld().getObjects(poisonApple.class).isEmpty())
       {
           int x = Greenfoot.getRandomNumber(600) + 100;
           int y = Greenfoot.getRandomNumber(600) + 100;
           getWorld().addObject( new poisonApple(), x, y);
        }
    }
}
