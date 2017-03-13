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
        super(600, 400, 1); 
        addObject(new ez(),150,150);
        addObject(new normal(),450,150);
        addObject(new hard(),300,320);
    }
}
