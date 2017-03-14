import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends World
{
    static GreenfootSound lostMusic = new GreenfootSound("Lost.wav");
    /**
     * Constructor for objects of class Score.
     * 
     */
    public Score()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Board(),400,300);
        addObject(new back(),750,580);
        addObject(new restart(),65,580);
        lostMusic.playLoop();
    }
}
