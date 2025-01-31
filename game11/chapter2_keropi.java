import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import java.awt.Graphics2D;
/**
 * Write a description of class select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chapter2_keropi extends World
{
    class TextLabelEx extends TextLabel
    {
        boolean enable;
        int xpos;
        int ypos;
        int size;
        boolean bold;
        greenfoot.Color gfcolor;
        java.awt.Color color;
        String text;
        String[] lines;
        private GraphicsUtilities.MultiLineStringDimensions dimensions = null;
        
        @Override
        public int getX(){ return xpos;}
        
        @Override
        public int getY(){ return ypos;}
        
        @Override
        public String getText(){ return text;}     
        
        public TextLabelEx(String _text, int _xpos, int _ypos, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            super("", 0, 0 );
            lines = new String[1];
            xpos = _xpos;
            ypos = _ypos;
            reset( _text, _size, _bold, _gfcolor );
        }
        
        public void reset( String _text, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            if( text == _text && size == _size && bold == _bold && gfcolor == _gfcolor ) return;
            text = _text;
            size = _size;
            bold = _bold;
            gfcolor = _gfcolor;
            lines[0] = text;
            dimensions = null;
            
            if( text.length() == 0 ) enable = false;
            else enable = true;
        }

        @Override
        public void draw(Graphics2D g, int cellsize)
        {
            if( !enable ) return;
            if(dimensions == null) {
                dimensions = GraphicsUtilities.getMultiLineStringDimensions(lines, bold ? java.awt.Font.BOLD : java.awt.Font.PLAIN, size);
                color = new java.awt.Color( gfcolor.getRed(), gfcolor.getGreen(), gfcolor.getBlue(), gfcolor.getAlpha() );
            }
                
            int ydraw = ypos * cellsize - dimensions.getHeight() / 2 + cellsize / 2;
            int xdraw = xpos * cellsize - dimensions.getWidth() / 2 + cellsize / 2;
            g.translate(xdraw, ydraw);
            GraphicsUtilities.drawOutlinedText(g, dimensions, color, java.awt.Color.BLACK);
            g.translate(-xdraw, -ydraw);
        }
    }   
    
    public void showTextEx(String text, int x, int y, int size, boolean bold, greenfoot.Color color )
    {
        for( TextLabel label : WorldVisitor.getTextLabels(this) ){
            if( label.getX() == x && label.getY() == y ){
                if( label instanceof TextLabelEx ){
                    ((TextLabelEx)label).reset(text, size, bold, color);
                    return;                    
                }
            }
        }
        WorldVisitor.getTextLabels(this).add(new TextLabelEx( text, x, y, size, bold, color ) );
        
        //showText( "labels: "+WorldVisitor.getTextLabels(this).size(), 80, 20 );
    }

    public chapter2_keropi()
    {    
        // Create a new world with 1600x900 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        
        // Add the bigtower objects to the world
        bigtower tower = new bigtower();
        GreenfootImage image = tower.getImage();
        image.scale(400, 400);
        tower.setImage(image);
        addObject(tower, getWidth() - 200, 200);
     
        smalltower small1 = new smalltower();
        GreenfootImage smallImage1 = small1.getImage();
        smallImage1.scale(260, 200); 
        small1.setImage(smallImage1);
        addObject(small1, getWidth() - 150, 480);
        smalltower small2 = new smalltower();
        GreenfootImage smallImage2 = small2.getImage();
        smallImage2.scale(260, 200);
        small2.setImage(smallImage2);
        addObject(small2, getWidth() - 400,420);

        smalltower small3 = new smalltower();
        GreenfootImage smallImage3 = small3.getImage();
        smallImage3.scale(260, 200); 
        small3.setImage(smallImage3);
        addObject(small3, getWidth() - 480, 240);
        showTextEx("塔を攻撃してください", 780, 100, 50, true, Color.WHITE );
        
        addObject(new enemy1(), 1500,200);
        addObject(new enemy2(), 1500,200);



        // Add the kate character to the world
        keropi player = new keropi();
        addObject(player,getWidth() - 1300, 700); // 初期位置 (左端中央)
    }
}

