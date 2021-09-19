package texture;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class Texture {
//	String img;
//	int id;
//	static HashMap<Integer, Texture> list = new HashMap<Integer, Texture>();
//	static HashMap<Integer, BufferedImage> images = new HashMap<Integer, BufferedImage>();
	HashMap<String, BufferedImage> images = new HashMap<String, BufferedImage>();
//
//	
//	public String getImg() {
//		return img;
//	}
//	public int getId() {
//		return id;
//	}
	

	public Texture ()
	{
		addImage( "00", "water.jpg");
		addImage( "01", "sand.png");
		addImage( "02", "grass.jpg");
		addImage( "03", "dirt.png");
		addImage( "04", "gravel.jpg");
	}
	
	public void addImage(String id , String fileName)
	{
		BufferedImage image;
		try 
		{
			image = ImageIO.read(new File(fileName));
			images.put(id, image);
		} catch (IOException e) 
		{
			System.out.println(fileName);
			e.printStackTrace();
		}
	}
	public BufferedImage getImage(String id)
	{
		return images.get(id);
	}
	
//	public static Texture getInstance(int id)
//	{
//		return list.get(id);
//	}
//	public static void addInstance(Texture texture)
//	{
//		list.put(texture.getId(), texture);
//	}
}
