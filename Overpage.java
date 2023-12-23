import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Overpage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overpage extends World
{

    /**
     * Constructor for objects of class Overpage.
     * 
     */
    public Overpage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 460, 1); 
        prepare();
    }

    public void prepare()
    {
        GameOver GameOver = new GameOver();
        addObject (GameOver, 490, 150);           
        Quit quit = new Quit();
        addObject(quit,358,308);
        showText("The shark ate you, you lose!",490,250);
        showText("YOUR SCORE:"+MyWorld.score.getValue()+"points",490,300);
        quit.setLocation(716,383);
        quit.setLocation(541,370);
    }
}
