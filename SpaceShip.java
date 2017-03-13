import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Dezio 
 */
public class SpaceShip extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("spaceship.png");
    GreenfootImage image1 = new GreenfootImage("spaceshipL.png");
    GreenfootImage image2 = new GreenfootImage("spaceshipR.png");
    Counter1 counter = new Counter1();
    Counter2 counter1 = new Counter2();
    public void act() 
    {
        checkKeyPress();
        if(isTouching(life.class)){
            removeTouching(life.class);
            counter.addScore();
            counter1.addLife();
        }
         if(isTouching(meteor.class)){
            removeTouching(meteor.class);
            counter1.mLife();
        }
    }    
    
    public void checkKeyPress(){
        
        if(Greenfoot.isKeyDown("left")){
            setImage(image1);
            setLocation(getX() -5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setImage(image2);
            setLocation(getX() +5 , getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setImage(image);
            setLocation(getX() , getY() -5);
        }
        if(Greenfoot.isKeyDown("down")){
            setImage(image);
            setLocation(getX() , getY() +5);
        }
    }
}
