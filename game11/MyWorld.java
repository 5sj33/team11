// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import java.awt.Graphics2D;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1600 , 900 , 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        int A = 0;
        if (A == 0) {
            /* showText("Ring of Legends",800,350);*/
            showTextEx ( "Ring of Legends" , 800 , 350 , 150 , true , Color . RED );
            showTextEx ( "Welcome to SamoLif" , 800 , 550 , 75 , true , Color . RED );
            A = A + 1;
        }
    }

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /* Reffered from core/TextLabel.java Copyright (C) 2013,2014 Poul Henriksen and Michael Kolling Licence: GPL2 Unsupported feature in Stride : inner class*/

    /**
     * 
     */
    public void showTextEx(String text, int x, int y, int size, boolean bold, greenfoot.Color color)
    {
        for (final TextLabel label : WorldVisitor . getTextLabels ( this )) {
            if (label . getX ( ) == x && label . getY ( ) == y) {
                if (label instanceof TextLabelEx) {
                    ( ( TextLabelEx ) label ) . reset ( text , size , bold , color );
                    return;
                }
            }
        }
        WorldVisitor . getTextLabels ( this ) . add ( new TextLabelEx ( text , x , y , size , bold , color ) );
        /* showText( "labels: "+WorldVisitor.getTextLabels(this).size(), 80, 20 );*/
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot . isKeyDown ( "space" )) {
            World game = new select ( );
            Greenfoot . setWorld ( game );
        }
    }
}
