import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Popu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popu3 extends Heroe
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    
    /**
     * Act - do whatever the Popu2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        muevePou();
    }    

    public void muevePou()
    {
        if(Greenfoot.isKeyDown("up"))
        {
         setDireccion(UP);
        }
        if(Greenfoot.isKeyDown("down"))
        {
         setDireccion(DOWN);
        }
        if(Greenfoot.isKeyDown("left"))
        {
         setDireccion(LEFT);
        }
        if(Greenfoot.isKeyDown("right"))
        {
         setDireccion(RIGHT);
        }
    }
    public void setDireccion(int direccion)
    {
        
        switch(direccion)
        {
              case UP:
              setRotation(270);
              setLocation(getX(),getY() -10);
              break;
            
              case DOWN:
              setRotation(90);
              setLocation(getX(),getY() +10);
              break;
              
              case LEFT:
              setRotation(0);
              setLocation(getX()-10,getY());
              break;
              
              case RIGHT:
              setRotation(0);
              setLocation(getX()+10,getY());
              break;
          
        }
    
    }
}
    
    