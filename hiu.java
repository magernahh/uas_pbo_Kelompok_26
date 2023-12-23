import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hiu extends Actor
{
    public int score;
    public hiu()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHight);
    }

    public void act()
    {
        setLocation(getX()-4, getY());
    if(isTouching(ikan.class))
    {
        removeTouching(ikan.class);
        
        Greenfoot.setWorld(new Overpage());
        
        Greenfoot.stop();
    }
    
    if(getX()<3)
       getWorld().removeObject(this);
   }
}  
