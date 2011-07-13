package monsterdudes.monsters;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 * Holds all the information for a player in battle.
 * @author Jacob Sawyer
 *
 */
public class Player extends Monster
{
	public Player()
	{
		super();
	}
	
	@Override
	protected void init() throws SlickException
	{
		sheet = new SpriteSheet("res/player.png", 32, 32);
		loadWalkingImages();
	}

}
