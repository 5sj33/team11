import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< HEAD
<<<<<<< HEAD
 * kate クラス
 * 'W', 'S', 'A', 'D' キーでキャラクターを操作できる
 */

public class kate extends Actor
{
    private int speed = 5; // 移動速度の設定
    private int attack=0;

    public kate() 
    {
        // 画像サイズを調整
        getImage().scale(341, 400);
    }

/*>>>>>>> df628f16de152212f1de7759f9a08e96c38dd4ff*/

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
<<<<<<< HEAD
        //getImage().scale(400, 360);
        
        Actor actor = getOneIntersectingObject( smalltower.class );
        if( actor != null ){
            // TARO とぶつかった時の処理を書く
            setLocation(getX() - speed, getY());
        }  
=======
        getImage().scale(400, 360);
        
        Actor actor = getOneIntersectingObject( enemy2.class );
        if( actor != null ){
            // enemy2 とぶつかった時の処理を書く
            attack++;
        }
>>>>>>> a9f203ff4a0f661f5f815349759fc0ebba0104cd
    }    
}

