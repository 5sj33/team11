import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< HEAD
 * kate クラス
 * 'W', 'S', 'A', 'D' キーでキャラクターを操作できる
 */
=======
<<<<<<<< HEAD:game11/smalltower.java
 * Write a description of class smalltower here.
========
 * Write a description of class kate here.
>>>>>>>> b48695dfdcd995ade1eb3f3139aee2ff74890793:game11/kate.java
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * <<<<<<<< HEAD:game11/smalltower.java
 */

public class kate extends Actor
{
    /**
     * Act - do whatever the smalltower wants to do. This method is called whenever
========
>>>>>>> de4a76d6570b287dd514d4393ea2cd1cb942c043
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
