import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceTBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceTBoss extends Actor
{
    Counter1 counter = new Counter1();
    private int velocity = 2;
    int hpboss = 40;
    public void act() 
    {
        moveAround();
        laser();
        if(isTouching(laser.class)){
            removeTouching(laser.class);
            counter.addScore();
            hpboss--;
            //getWorld().removeObject(this);
        }
        else if(hpboss==0){
          getWorld().addObject(new Explosion(),getX(),getY());
          getWorld().removeObject(this);
        }
        
   }
   int n = 60;
        public void moveAround()
        {
           int y = getY();
           move(velocity);
           if(n>30){
               n--;
           this.setLocation(getX(),y+1);
        }
        if(n<30){
               n++;
           this.setLocation(getX(),y-1);
        }
           if(isAtEdge()){
                velocity = velocity*-1;
           }
           
    }  
    public void laser()
    {
       if (Greenfoot.getRandomNumber(100)<2){
            getWorld().addObject(new laserT(), getX()-45, getY());
        }
        if (Greenfoot.getRandomNumber(100)<2){
            getWorld().addObject(new laserT(), getX()+45, getY());
        }
    }
}
