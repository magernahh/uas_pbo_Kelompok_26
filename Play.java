import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    public Play()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
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
            Greenfoot.setWorld(new MyWorld());
        }
    }
} 
