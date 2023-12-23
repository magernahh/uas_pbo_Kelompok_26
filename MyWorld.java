import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter ("Hp: ");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 460, 1);
        prepare();
    }
    
     public void act()
    {
        if (Greenfoot.getRandomNumber(100) <3)
        {
          addObject(new bintanglaut(), 958, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new hiu(), 700, Greenfoot.getRandomNumber(360));
        }
        
        if (MyWorld.score.getValue()>=20)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Secondlevel());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ikan ikan = new ikan();
        addObject(ikan,171,198);
        bintanglaut bintanglaut = new bintanglaut();
        addObject(bintanglaut,574,207);
        hiu hiu = new hiu();
        addObject(hiu,787,168);
        removeObject(bintanglaut);
        hiu.setLocation(752,175);
        hiu.setLocation(752,175);
        removeObject(hiu);
        ikan.setLocation(103,246);
        ikan.setLocation(91,224);
        
        addObject(score, 80, 45);
        score.setValue(0);
        
        hp.setValue(1);
    }
}    