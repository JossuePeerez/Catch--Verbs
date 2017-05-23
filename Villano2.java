import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villano2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villano2 extends Villano
{
    private int x;
    private int y;
    /**
     * Act - do whatever the Villano2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        // Add your action code here.
        x=getX();
        y=getY();
        
        if(x>450)
        move(1);
        if(x<10)
        move(1);
 

    }    
}
