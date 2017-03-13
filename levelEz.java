import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelEz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelEz extends World
{
    private int wave = 1;
    private int spawnShip = 20+5*wave;
    private int timer = 120;
    GreenfootSound backgroundMusic = new GreenfootSound("Unity.wav");
    GreenfootSound lostMusic = new GreenfootSound("Lost.wav");
    GreenfootSound winMusic = new GreenfootSound("Win.wav");
    int n=100;
    int life = 0;
    int x = 0;
    public levelEz(){    
        super(600, 400, 1); 
        addObject(new SpaceShip(), 300, 530);
        spawn();
        Timer();
        
        
    }
    public void act(){
        showText("ARE YOU READY?!? ",400,400);
        //showText("Timer "+ timer,50,50);
        //backgroundMusic.playLoop();
        spawn();
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
    }
    public void spawn(){
        int x=0;
        
        n--;
    if(spawnShip>0 && n<1+x){
            addObject(new spaceT(),Greenfoot.getRandomNumber(getWidth()),20);
            spawnShip--;
            n=120;
        }
        if(wave>=3 && spawnShip==0){
            Greenfoot.setWorld(new MyWorld());
        }
        if(spawnShip==0){
            wave++;
            x=x+5;
            spawnShip = 20+5*wave;
        }
}
public void Timer(){
    if (timer>0){
    timer--;
    
       if(timer == 0){
        Greenfoot.stop();
       }
    }
 }
}