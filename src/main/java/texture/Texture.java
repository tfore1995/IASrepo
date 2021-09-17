package texture;

import java.util.HashMap;


public class Texture {
	String img;
	int id;
	static HashMap<Integer, Texture> list = new HashMap<Integer, Texture>();


	
	public String getImg() {
		return img;
	}
	public int getId() {
		return id;
	}
	
	public static Texture getInstance(int id)
	{
		return list.get(id);
	}
	public static void addInstance(Texture texture)
	{
		list.put(texture.getId(), texture);
	}
}
