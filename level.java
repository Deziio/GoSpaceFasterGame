import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{

    /**
     * Constructor for objects of class level.
     * 
     */
    public level()
    {    
        super(800, 600, 1); 
        addObject(new ez(),250,250);
        addObject(new normal(),550,250);
        addObject(new hard(),400,450);
        addObject(new back(),720,540);
    }
}
