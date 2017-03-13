import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
 
/**
 * 
 * @author Dezio
 */
public class Counter2 extends Actor
{
    public static int life;
    /**
     * Act - do whatever the Counter2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter2(){
       life = 5;
    }
    public void act() 
    {
        setImage(new GreenfootImage("Life : " + life, 24, Color.GREEN, Color.BLACK));
    }    
    public void addLife(){
        life++;
    }
    public void mLife(){
        life--;
    }
}
