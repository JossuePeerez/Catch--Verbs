import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private Popu popu;
    private Words word;
    private int r,rand;
    private int nivel=1;
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
    public Game()
    {    
        super(500, 600, 1); 
        popu=new Popu();
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(popu,250,580);
    }
    public Popu getPopu()
    {
        return popu;
    }
    public void act()
    {
        if(nivel==1)
        {
          
            nivel1();
        }
        /*else if(nivel==2)
        {
            nivel2();
        }*/
    }
    public void nivel1()
    
    {
        showText("puntaje:", 410, 33);
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
    }

   
   public void nivel2()
    {
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
    }
    
}
