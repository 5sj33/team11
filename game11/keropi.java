import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keropi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keropi extends Actor
{
    
    private int attack=0;
    private int do_attack=0;
    /**
     * Act - do whatever the keropi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale(400,360);
        
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
        
        //体当たり攻撃
        Actor enemy2 = getOneIntersectingObject( enemy2.class );
        Actor smalltower = getOneIntersectingObject( smalltower.class );
        if( enemy2 != null ){
            // enemy2 とぶつかった時の処理を書く
            attack++;
            
            if( smalltower != null ){
                getWorld().removeObject( smalltower );
                
            }
            if(attack == 1){
                getWorld().showText( "HP 80", 100, 100 );
                
            }else if(attack == 2){
                getWorld().showText( "HP 40", 100, 100 );
            }else if(attack == 3){
                getWorld().showText( "HP 0", 100, 100 );
                getWorld().showText( "GAME OVER", 400, 200 );
                Greenfoot.stop();  //stop program
            }

            
            
            
        }  
        
        if( smalltower != null ){
           getWorld().removeObject( smalltower );
           do_attack++;
           if(do_attack == 3){
                getWorld().showText( "CLEAR", 400, 200 );
                Greenfoot.stop();  //stop program
            }
        }
        
    }
    
}
