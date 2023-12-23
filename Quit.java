import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quit extends Actor
{
    public Quit()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHight);
    }

    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Homepage());
        }
    }
}
