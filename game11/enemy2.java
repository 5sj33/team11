import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy2 extends Actor
{
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale(250, 190);
        int A = 0;
        int B = 600;
        //int C = A + (int)(Math.random()*((B-A)+1));
        int C = A + (int)(Math.random()*(B-A));
        
        setRotation(C);
        move(50);
    }    
}
