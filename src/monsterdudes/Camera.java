package monsterdudes;

import org.newdawn.slick.GameContainer;

public class Camera
{
	public GameContainer c;
	public float x;
	public float y;
	
	public Camera(GameContainer c, float x, float y)
	{
		this.c = c;
		this.x = x;
		this.y = y;
	}

	public void updateLocation(float x2, float y2)
	{
		this.x = ((x2 * Game.TILE_SIZE) * Game.SCALE) - (c.getWidth()/2);
		this.y = ((y2 * Game.TILE_SIZE) * Game.SCALE) - (c.getHeight()/2);
	}

}