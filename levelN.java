import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelN extends World
{   int asteroid = 0;
    private int wave = 1;
    private int spawnShip = 20+5*wave;
   static GreenfootSound backgroundMusic = new GreenfootSound("Unity.wav");
    //GreenfootSound lostMusic = new GreenfootSound("Lost.wav");
    //GreenfootSound bossMusic = new GreenfootSound("Boss.mp3");
    int n=120;
    int life = 0;
    int x = 0; int y = 0;
    Timer timerText = new Timer();
    public levelN(){    
        super(800, 600, 1); 
        addObject(new SpaceShip(), 300, 530);
        addObject(new Counter1(), 500, 20);
        addObject(new Counter2(), 50, 20);
        addObject(timerText, 82, 48);
        Timer.timer = 9000;
        Counter1.score = 0;
        backgroundMusic.playLoop();
        addObject(new back(),750,580);
        addObject(new restart(),65,580);
    }
    public void act(){
        Timer.timer--;
        timerText.setText("Time left: " + (Timer.timer/60));
        //showText("Timer "+ timer,50,50);
        asteroid+=1;
        if(asteroid==100-(y/3)){
            addObject(new asteroid(),Greenfoot.getRandomNumber(getWidth()),20);
            asteroid=0;
            y++;
        }
        spawn();
        life+=1;
        if(life==500){
            addObject(new life(),Greenfoot.getRandomNumber(getWidth()),15);
            life=0;
        }
        if(Timer.timer==0 || Counter2.life==0){
            backgroundMusic.stop();
            //lostMusic.playLoop();
            Score x =new Score();
            Greenfoot.setWorld(x);
        }
    }
    public void spawn(){  
        n--;
    if(spawnShip>0 && n<50+x){
            addObject(new spaceT(),Greenfoot.getRandomNumber(getWidth()),20);
            spawnShip--;
            n=110;
        }
        if(wave>=6 && spawnShip==0){
            Score x =new Score();
            Greenfoot.setWorld(x);
        }
        if(spawnShip==0){
            wave++;
            x=x+5;
            spawnShip = 20+5*wave;
        }
}
 }