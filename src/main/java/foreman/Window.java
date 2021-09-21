package foreman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import texture.Texture;

public class Window extends JPanel implements KeyListener
{
    public static final int NUM_ROWS = 9;
    public static final int NUM_COLS = 15;

    public static final int PREFERRED_GRID_SIZE_PIXELS = 100;
    
    Texture texture = new Texture();
    BufferedImage water = null;
    BufferedImage image;
    int locationx = NUM_COLS/2;
    int locationy = NUM_ROWS/2;
    Coordinates coordinates = Coordinates.getInstance();
    Player player = new Player();
    
    public Window()
    {
        try 
        {
        	water = ImageIO.read(new File("water.jpg"));
        } catch (IOException e) {
        }
        
        int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXELS;
        int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXELS;
        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
//        System.out.println(coordinates.toString());
        addKeyListener(this);
        
        this.setFocusable(true);
        this.requestFocusInWindow();
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        // Important to call super class method
        super.paintComponent(g);
        // Clear the board
        g.clearRect(0, 0, getWidth(), getHeight());
        // Draw the grid
        int rectWidth = PREFERRED_GRID_SIZE_PIXELS;
        int rectHeight = PREFERRED_GRID_SIZE_PIXELS;

        
        
        for (int i = -1; i < NUM_COLS + 1; i++) {
            for (int j = -1; j < NUM_ROWS + 1; j++) {
            	g.setColor(Color.BLACK);
                // Upper left corner of this terrain rect
                int x = i * rectWidth;
                int y = j * rectHeight;
//                Color terrainColor = terrainGrid[i][j];
//                g.setColor(terrainColor);
//                g.fillRect(x, y, rectWidth, rectHeight);
//                g.drawImage(water, x, y, rectWidth, rectHeight, null);
                String key;
//                try
//                {
//                	key = coordinates.getCoordinate(i, j);
//                	image = texture.getImage(key);
//                	g.drawImage(image, x, y, rectWidth, rectHeight, null);
////                	System.out.println("Key : " + key);
////                	System.out.println("i : " + i);
////                	System.out.println("j : " + j);
//                }
//                catch (Exception e)
//                {
//                	System.out.println(e);
//                	g.fillRect(x, y, rectWidth, rectHeight);
//                }

                
            	key = coordinates.getCoordinate(i, j);
            	if(key != null)
            	{
	            	image = texture.getImage(key);
            	}
            	else
            	{
            		image = null;
            	}
            	
            	if(image != null)
            	{
	            	g.drawImage(image, x, y, rectWidth, rectHeight, null);
            	}
            	else
            	{
	            	g.fillRect(x, y, rectWidth, rectHeight);
            	}

            
                g.setColor(Color.RED);
                g.drawRect(x, y, rectWidth, rectHeight);
//                System.out.println("(i,j) : " + "(" + i + "," + j + ")");
//                System.out.println("(x,y) : " + "(" + x + "," + y + ")");
                
            }
        }
        g.setColor(Color.RED);
//        g.fillOval(locationx * rectWidth, locationy * rectHeight, rectWidth, rectHeight);
        g.fillOval(player.getLocationx() * rectWidth, player.getLocationy() * rectHeight, rectWidth, rectHeight);
        g.drawOval(locationx * rectWidth, locationy * rectHeight, rectWidth, rectHeight);
//        g.drawImage(water, 700, 200, rectWidth, rectHeight, null);
//        g.drawRect(700, 200, rectWidth, rectHeight);
//        System.out.println(locationx);
//        System.out.println(locationy);
    }
    
    public void keyPressed(KeyEvent e) {

//    	System.out.println("Pressed " + e.getKeyChar());
//    	System.out.println("Code  " + e.getKeyCode());
    }


	public void keyReleased(KeyEvent e) {
//		System.out.println("Released " + e.getKeyChar());
//    	System.out.println("Code  " + e.getKeyCode());
		switch (e.getKeyCode())
		{
		case 38:
			//up
			System.out.println("up");
			player.moveY(-1);
			break;
		case 37:
			//left
			System.out.println("left");
			player.moveX(-1);
			break;
		case 39:
			//right
			System.out.println("right");
			player.moveX(1);
			break;
		case 40:
			//down
			System.out.println("down");
			player.moveY(1);
			break;
		}
		
		this.repaint();
	}


	public void keyTyped(KeyEvent e) {
//		System.out.println("Typed " + e.getKeyChar());
//    	System.out.println("Code  " + e.getKeyCode());
		
		
	}
	

}
