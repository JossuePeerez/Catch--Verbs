import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import java.awt.Font;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Write a description of class Palabras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Words extends Actor
{
    /**
     * Act - do whatever the Palabras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int ran;
    private int n=2;
    private Popu c;
    private int x;
    private int y;
    private int rota;
    
    public Words(String text,int rot)
    {
        //GreenfootImage gi= new greenfoot.GreenfootImage(100,30);
        //gi.setFont( new Font( "Serif", Font.BOLD, 12 ));
        //gi.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
        //gi.drawString(text,2,25);
        //setImage(gi);
        GreenfootImage textImage = new GreenfootImage(text, 24, new Color(38, 165, 219), new Color(0, 0, 0, 0));
        setImage(textImage);
        rota=rot;
        setRotation(rota); //De 45 a 135
    } 
    public void act() 
    {
        // Add your action code here.
        x=getX();
        y=getY();
        getWorld();
        
        verifica();
        move(n);
         
        //tambalea();
    }    
    
    /**

     */
    public void verifica()
    {
        if(x<10)
        {
            rota=rota*-1;
            setRotation(rota);
            n=n*-1;
        }
        else if(x>490)
        {
            rota=rota*-1;
            setRotation(rota);
            n=n*-1;
        }
        
        /*ame mundo = (Game)getWorld();
        Popu c = mundo.getPopu();   
        ran=Greenfoot.getRandomNumber(600);
        int x;
        x=getX();
        */
        /*if(isTouching(Popu.class))
        {
           // c.aumentapuntos(10);
            //mundo.removeObject(this);
        }*/

        if(y>590)
        { 
            getWorld().removeObject(this);
        }
    }
}
