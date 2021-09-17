package foreman;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import texture.Texture;

public class FileService {
	
	
    public Coordinates loadMap(String mapName) 
    {
    	System.out.println("FileService : loadMap()");
    	String delimiter = ",";
    	String[][] map = new String[0][];
    	Coordinates coordinates = new Coordinates();
    	try 
		{

			FileInputStream fis = new FileInputStream(mapName);
			BufferedReader ois = new BufferedReader(new InputStreamReader(fis));
			String strLine;
			
			int i = 0;
			while ((strLine = ois.readLine()) != null)   
			{	  
				String[] splits = strLine.split(delimiter);
				for(int j = 0; j < splits.length; j ++)
				{
					coordinates.storeCoordinate(j, i, splits[j]);
				}
				i++;
			}
			ois.close();

		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

		return coordinates;
    }
        
    public void printArray(Object[] row)
    {
    	String line = "";
    	line += "[ ";
    	for(int i = 0; i < row.length; i ++)
    	{
    		line += row[i].toString();
    		if(i < (row.length - 1))
    		{
    			line += " | ";
    		}
    	}
    	line += " ]";
    	System.out.println(line);
    }


}
