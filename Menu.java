import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private Start start;
    private help ayuda;
    private Rec cred;
    private Autors autor;
    private int nivel=1;

    //private Credito cred;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1);   
        start=new Start();
        addObject(start,250,300);
        ayuda=new help();
        addObject(ayuda,330,300);
        cred=new Rec();
        addObject(cred,250,380); 
        autor=new Autors();
        addObject(autor,330,380);
    }
    
    public void act()
    {    
        if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == start)
            {
                        // press.play();
                    Greenfoot.delay(30);
                    Greenfoot.setWorld( new Nivel2());
                   
             }
                
         }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda)
            {
               // press.play();
                Greenfoot.delay(5);
               // fondo.stop();
                Greenfoot.setWorld( new Ayuda());
            }
        }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == cred)
            {
               // press.play();
                Greenfoot.delay(5);
               // fondo.stop();
                Greenfoot.setWorld( new Records());
            }
        }

        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==autor)
            {
                //press.play();
                Greenfoot.delay(5);
                //fondo.stop();
                Greenfoot.setWorld(new Credito());
            }
        }
    }
}
