import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bintanglaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bintanglaut extends Actor
{
    private int speed;
    public bintanglaut()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/9;
        int myNewWidth = (int)myImage.getWidth()/9;
        myImage.scale(myNewWidth, myNewHight);
        
        speed=Greenfoot.getRandomNumber(4)+1;
    }

    public void act()
    {
        setLocation(getX()-speed, getY());
        turn(1);
        if (getX() == 0)
        {
            Secondlevel.score.add(-1);
            getWorld().removeObject(this);
        }
    }
}
