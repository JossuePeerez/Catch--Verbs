import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    //private Trueno trueno;
    private Popu2 popu2;
    private Trueno rayo;
    private Villano2 malo1;
    
    private Words word;
    private int r,rand;
    private int nivel=2;
    
    private String[] Awords = {"ask", "borrow", "brush", 
        "call", "check", "clean", "climb", "cook", "cover", 
        "cross","cross","dream","dress","earn","end","enter","enjoy",
        "explain","fail"};
        
    private String[] FWords = {"asq", "borou", "bush", 
        "calli", "chek", "cleen", "claimb", "cocacola", "cober", 
        "ros","rosx2","druim","dres","irn","ennd","intersemestral","enyoi",
        "explanada","faill"};

        
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nivel2()
    {    
        super(500, 600, 1); 
     
        popu2 = new Popu2();
        addObject(popu2 ,250,280);
        
        malo1 = new Villano2();
        addObject(malo1,450,50);
       
    }
   
    public void act()
    {
        //ask(nombre);   ask(java.lang.String prompt)    Obtener la entrada del usuario (y congelar el escenario mientras estamos esperando)
       
        //Greenfoot.playSound("sounds/Undertale Mettaton EX Theme  Death By Glamour.mp3");
        showText("puntaje:",50,40);
        showText("nombre:",50,60);
   
        setBackground("castle.png");
        
        //Greenfoot.setSpeed(100);
        if(Greenfoot.getRandomNumber(1000)<=20)
            {
                rand = Greenfoot.getRandomNumber(90);
                rand = rand+45;    
                if(Greenfoot.getRandomNumber(2)==0) //When Real
                {
                    r=Greenfoot.getRandomNumber(Awords.length);
                    word=new Real(Awords[r],rand);
                    addObject(word,(Greenfoot.getRandomNumber(400))+20,10); 
                } 
                else  //When fake
                {
                    r=Greenfoot.getRandomNumber(FWords.length);
                    word=new Fake(FWords[r],rand);
                    addObject(word,(Greenfoot.getRandomNumber(400))+20,10); 
                }
            }
            
            
        if(Greenfoot.getRandomNumber(1000)<=3)
        { 
            addObject(new Trueno(),450,60);
            addObject(new Trueno(),50,80);
            addObject(new Trueno(),100,10);
        }
       
    }
}