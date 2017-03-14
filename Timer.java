import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    static int timer;
    public Timer()
    {
        this("");
        timer = 10800;
    }
 
    public Timer(String text)
    {
        setText(text);
    }
 
    public void setText(String text)
    {
        setImage(new GreenfootImage(text, 24, Color.white, new Color(0, 0, 0, 0)));
    } 
}  
