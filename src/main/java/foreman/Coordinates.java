package foreman;

import java.util.HashMap;

public class Coordinates 
{
	private static Coordinates single_instance = null;
	private static HashMap<String, String> map;
	
	
	public Coordinates()
	{
		map = new HashMap<String, String>();
	}
	public static Coordinates getInstance()
	{
        if (single_instance == null)
            single_instance = new Coordinates();
 
        return single_instance;
	}
	
	public String getCoordinate(int x, int y)
	{
		String key = "(" + x + "," + y + ")";
		return map.get(key);
	}
	public String getCoordinate(String key)
	{
		return map.get(key);
	}
	
	public void storeCoordinate(int x, int y, String value)
	{
		String key = "(" + x + "," + y + ")";
		map.put(key, value);
	}
}
