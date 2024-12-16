import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
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
    
    public void act() 
    {
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
    }
}
