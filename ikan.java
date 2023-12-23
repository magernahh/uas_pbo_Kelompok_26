import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ikan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ikan extends Actor
{
    public ikan()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHight);
    }

    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-8);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+8);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }
    }   
    private void checkCollision()
    {
        if(isTouching(bintanglaut.class))
        {
            removeTouching(bintanglaut.class);
            MyWorld.score.add(2);
            Secondlevel.score.add(2);
        }
        if(isTouching(jellyfish.class))
        {
            removeTouching(jellyfish.class);
            MyWorld.score.add(2);
            Secondlevel.score.add(2);
        }
    }      
}
