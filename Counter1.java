import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
 
/**
 * 
 * @author Dezio
 */
public class Counter1 extends Actor
{
    public static int score;
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter1(){
         
    }
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }    
     
    public void addScore(){
        score++;
    }
    public void mScore(){
        score--;
    }
}