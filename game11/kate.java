import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class kate extends Actor
{
    private int speed = 5; // 移動速度の設定
    private int attack=0;
    private int do_attack=0;

    public kate() 
    {
        // 画像サイズを調整
        getImage().scale(341, 400);
    }


    public void act() 
    {
        // キー入力による移動
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed); // 上に移動
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed); // 下に移動
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY()); // 左に移動
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY()); // 右に移動
        }

        // 画像の大きさを設定
        //getImage().scale(400, 360);
        
        Actor actor = getOneIntersectingObject( smalltower.class );
        if( actor != null ){
            // TARO とぶつかった時の処理を書く
            setLocation(getX() - speed, getY());
        }  
        getImage().scale(400, 360);
        
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

