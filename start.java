import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    GreenfootSound backgroundMusic = new GreenfootSound("Unity.wav");
    GreenfootSound lostMusic = new GreenfootSound("Lost.wav");
    GreenfootSound winMusic = new GreenfootSound("Win.wav");
    int meteor = 0;
    int life = 0;
    int x = 0;
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new SpaceShip(), 300, 530);
        addObject(new Counter1(), 500, 20);
        addObject(new Counter2(), 50, 20);
        meteor = 0;
        life = 0;
    }
    public void act(){
        backgroundMusic.playLoop();
        meteor+=1;
        if(meteor==50-(x/3)){
            addObject(new meteor(),Greenfoot.getRandomNumber(getWidth()),20);
            meteor=0;
            x++;
        }
       life+=1;
        
        if(life==500){
            addObject(new life(),Greenfoot.getRandomNumber(getWidth()),15);
            life=0;
        }
           
        if(Counter2.life<=0){
         showText("SCORE "+Counter1.score,400,400);
         Counter1.score = 0;
         showText("YOU DEAD!!!",300,300);
         backgroundMusic.stop();
         lostMusic.playLoop();
        //MyWorld x = new MyWorld();
        Greenfoot.stop();
        //Greenfoot.setWorld(x);
         }
        if(Counter1.score>=100){
         showText("SCORE "+Counter1.score,400,400);
         Counter1.score = 0;
         showText("YOU WIN!!!",300,300);
         backgroundMusic.stop();
         winMusic.playLoop();
        //MyWorld x = new MyWorld();
        //Greenfoot.setWorld(x);
        Greenfoot.stop();
            }
        }
    }
