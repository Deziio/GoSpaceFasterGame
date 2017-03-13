import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Dezio
 */
public class life extends Actor{

    public void act() 
    {
        this.setLocation(getX(),getY()+2);
      if(getY()>=550){
          getWorld().removeObject(this);
        }
    }    
}
