import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
   private SpaceShip spaceShip;
     
   public void act(){
       this.setLocation(getX(),getY()-5);
      if(isAtEdge()){
          getWorld().removeObject(this);
        }
    }
}
