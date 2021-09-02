package foreman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {
	JFrame frame;
	
	public void start()
	{
		ImageIcon water = new ImageIcon ("water.jpg");
		Label labell = new Label("TacoSalad");
		JLabel label2;
		
		label2 = new JLabel(water);
		label2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		frame = new JFrame("IAS Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
        JPanel grid = new JPanel();
        int square = 5;
        grid.setLayout(new GridLayout(square, square));
        for (int i = 0; i < square; i++) {
            for (int n = 0; n < square; n++) {
//                grid.add(new JLabel(water));
        		label2 = new JLabel(water);
        		label2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                grid.add(label2);
                
            }
        }
        
        frame.add(grid);
        frame.setBounds(100, 100, 600, 600);
//		frame.pack();

		//5. Show it.
		frame.setVisible(true);
	}

}
