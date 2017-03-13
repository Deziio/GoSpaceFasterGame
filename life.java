import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Dezio
 */
public class life extends Actor{

    public void act() {
        this.setLocation(getX(),getY()+2);
      if(isAtEdge()){
          getWorld().removeObject(this);
        }
    }
}
