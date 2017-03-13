import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laserT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laserT extends Actor
{
   public void act(){
      this.setLocation(getX(),getY()+2);
      if(isAtEdge()){
          getWorld().removeObject(this);
        }
    }
}
