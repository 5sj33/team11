import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< HEAD
<<<<<<< HEAD
 * kate クラス
 * 'W', 'S', 'A', 'D' キーでキャラクターを操作できる
 */

public class kate extends Actor
{
    public kate() 
    {
        // 画像サイズを調整
        getImage().scale(341, 400);
    }
    
=======
 * Write a description of class kate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kate extends Actor
{
    private int speed = 5; // 移動速度の設定

>>>>>>> df628f16de152212f1de7759f9a08e96c38dd4ff
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
        getImage().scale(400, 360);
    }    
}
