package foreman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
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

public class Window extends JPanel
{
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 15;

    public static final int PREFERRED_GRID_SIZE_PIXELS = 100;
    
    BufferedImage water = null;
    
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

        for (int i = -1; i < NUM_ROWS + 1; i++) {
            for (int j = -1; j < NUM_COLS + 1; j++) {
                // Upper left corner of this terrain rect
                int x = j * rectWidth;
                int y = i * rectHeight;
//                Color terrainColor = terrainGrid[i][j];
//                g.setColor(terrainColor);
//                g.fillRect(x, y, rectWidth, rectHeight);
                g.drawImage(water, x, y, rectWidth, rectHeight, null);
                g.drawRect(x, y, rectWidth, rectHeight);
//                System.out.println("(i,j) : " + "(" + i + "," + j + ")");
//                System.out.println("(x,y) : " + "(" + x + "," + y + ")");
                
            }
        }
        
//        g.drawImage(water, 700, 200, rectWidth, rectHeight, null);
//        g.drawRect(700, 200, rectWidth, rectHeight);
    }
	

}
