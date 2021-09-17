package foreman;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Engine {

	
	public static void main(String[] args) 
	{
		Engine eng = new Engine();
		eng.map();
	}
	
	JFrame frame;
	
	public Engine()
	{
		frame = new JFrame("IAS Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}
	
	public void map()
	{
		Coordinates map;

		
		String defaultLocation = "(5,5)";
		//need to fix this one asap
		
		
		FileService fileService = new FileService();
		map = fileService.loadMap("map.txt");
		
		
//		System.out.println(map.getCoordinate(defaultLocation));
		
//        JPanel grid = new JPanel();
//        
//        int square = 5;
//        grid.setLayout(new GridLayout(square, square));
//        for (int i = 0; i < square; i++) {
//            for (int n = 0; n < square; n++) {
////                grid.add(new JLabel(water));
//        		label2 = new JLabel(water);
//        		label2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//                grid.add(label2);
//                
//            }
//        }
//        return grid;
		
		Window win = new Window();
        frame.add(win);
//      frame.setBounds( 200, 200, 600, 600);
		frame.pack();

		//5. Show it.
		frame.setVisible(true);
	}
	
	public JPanel cardInfo()
	{
		
		ImageIcon water = new ImageIcon ("water.jpg");
		JLabel labell = new JLabel("level");
		JLabel label2 = new JLabel("name");
		JLabel label3 = new JLabel("class");
		JLabel label4 = new JLabel("weight");
		JLabel label5 = new JLabel("pic");
		JLabel label6 = new JLabel("description");
		JLabel label7 = new JLabel("attack info");
		JLabel label8 = new JLabel("id info");
		
//		label2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		


		
        JPanel grid = new JPanel();
        int square = 5;
        grid.add(labell);
        grid.add(label2);
        grid.add(label3);
        grid.add(label4);
        grid.add(label5);
        grid.add(label6);
        grid.add(label7);
        grid.add(label8);
        
        return grid;
	}
	
	public void idle()
	{
		// beggining of map, pull 9 map event cards
		// every 2 mins ish pull pull another event card
		//(map event card deck gets shuffled after each draw)
		
		//players dont take turns , unless interacting with the same object
		
		// main goal to craft items, or trade for better items to help lv up
	}
	

}
