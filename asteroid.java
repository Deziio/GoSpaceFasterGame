import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * fish spin!
 * 
 * @author Dezio
 */
public class asteroid extends Actor
{
    int ashp = 2;
    public void act() 
    {
        turn(10);
      this.setLocation(getX(),getY()+2);
      if(isTouching(laser.class)){
            removeTouching(laser.class);
            ashp--;
        }
      else if(ashp==0){
            getWorld().removeObject(this);
        }
      else if(getY()>=550){
          getWorld().removeObject(this);
        }
    }    
}
