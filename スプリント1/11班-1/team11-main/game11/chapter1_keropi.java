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
public class chapter1_keropi extends World
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
    /**
     * Constructor for objects of class select.
     * 
     */
    public chapter1_keropi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        
        showTextEx("keropi", 350, 300, 150, true, Color.WHITE );
        showTextEx("このキャラクターは体で攻撃します！", 400, 400, 50, true, Color.WHITE );
        showTextEx("体当たりが得意または好きな人", 400, 500, 50, true, Color.WHITE );
        showTextEx("におすすめのキャラクターです！", 400, 600, 50, true, Color.WHITE );
        
        addObject(new keropi(), 1300,550);
        showTextEx("Keropi", 1300, 300, 40, true, Color.WHITE );
        
        showTextEx("スペースで続行→", 700, 800, 50, true, Color.WHITE );
        showTextEx("←Escで選択画面に戻る", 700, 850, 50, true, Color.WHITE );
        
        
        
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new chapter3_keropi();
            Greenfoot.setWorld( game );
        }else if(Greenfoot.isKeyDown( "escape" )){
            World game = new select();
            Greenfoot.setWorld( game );
        }
    }
    
}
