import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Score.lostMusic.stop();
            Greenfoot.setWorld(new level());
            levelH.backgroundMusic.stop();
            levelN.backgroundMusic.stop();
            levelEz.backgroundMusic.stop();
            
    }     
    }    
}
