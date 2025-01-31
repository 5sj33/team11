import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runrun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runrun extends Actor
{
    private int attack=0;
    /**
     * Act - do whatever the runrun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale(400,400);
        
        // W, S, A, D キーでキャラクターを移動
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 5); // 前進 (上に移動)
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 5); // 後退 (下に移動)
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 5, getY()); // 左 (左に移動)
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 5, getY()); // 右 (右に移動)
        }
        
        Actor actor = getOneIntersectingObject( enemy2.class );
        if( actor != null ){
            // enemy2 とぶつかった時の処理を書く
            attack++;
        }
    }    
}
