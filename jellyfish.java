import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jellyfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jellyfish extends Actor
{
    private int speed;
    public jellyfish()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHight);
        
        speed=Greenfoot.getRandomNumber(4)+1;
    }

    public void act()
    {
        setLocation(getX()-speed, getY());
        turn(1);
        if (getX() == 0 )
        {
            Secondlevel.score.add(-1);
            getWorld().removeObject(this);
        }
    }  
}

