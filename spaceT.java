import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spaceT extends Actor{
    Counter1 counter = new Counter1();
    private int velocity = 3;
    
    public void act() 
    {
        moveAround();
        laser();
        if(isTouching(laser.class)){
            removeTouching(laser.class);
            counter.addScore();
            //removeTouching(spaceT.class);
            getWorld().removeObject(this);
        }
        else if(getY()>=550){
          getWorld().removeObject(this);
        }
        
        
   }
        public void moveAround()
        {
           int y = getY();
           move(velocity);
           this.setLocation(getX(),y+1);
           if(isAtEdge()){
                velocity = velocity*-1;
           }
           
    }  
    public void laser()
    {
       if (Greenfoot.getRandomNumber(100)<1){

            getWorld().addObject(new laserT(), getX(), getY());
        }
    }
}
