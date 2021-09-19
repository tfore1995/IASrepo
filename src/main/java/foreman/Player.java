package foreman;

public class Player 
{
	int locationx = 5;
	int locationy = 5;
	public int getLocationx() {
		return locationx;
	}
	public int getLocationy() {
		return locationy;
	}

	public void moveXY(int x, int y)
	{
		locationx += x;
		locationy += y;
	}
	public void moveX(int x)
	{
		locationx += x;
	}
	public void moveY(int y)
	{
		locationy += y;
	}
	
}
