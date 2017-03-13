import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * fish spin!
 * 
 * @author Dezio
 */
public class meteor extends Actor
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(10);
      this.setLocation(getX(),getY()+2);
      if(getY()>=550){
          getWorld().removeObject(this);
        }
    }    
}
