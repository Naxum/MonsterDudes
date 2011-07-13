package monsterdudes.monsters.beasts;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import monsterdudes.monsters.Monster;
import monsterdudes.worldmap.entities.Entity.Direction;

public class CavePotato extends Monster
{
	public CavePotato() 
	{
		super();
		//TODO: Dynamically load stats from files
		
		
	}
	
	protected void init() throws SlickException
	{
		//TODO: Load battle images
		
		sheet = new SpriteSheet("res/monsters/cavepotato.png", 32, 32);
		
		Animation down = new Animation(getWalkSprites(Direction.DOWN), 1, false);
		Animation left = new Animation(getWalkSprites(Direction.LEFT), 1, false);
		Animation right = new Animation(getWalkSprites(Direction.RIGHT), 1, false);
		Animation up = new Animation(getWalkSprites(Direction.UP), 1, false);
		
		walkAnimation.put(Direction.DOWN, down);
		walkAnimation.put(Direction.LEFT, left);
		walkAnimation.put(Direction.RIGHT, right);
		walkAnimation.put(Direction.UP, up);
	}
	
	public Image[] getWalkSprites(Direction d)
	{
		int x = 0;
		
		if(d == Direction.RIGHT)
		{
			x = 1;
		}
		else if (d == Direction.UP)
		{
			x = 2;
		}
		
		Image[] images = {sheet.getSprite(x, 0), sheet.getSprite(x, 1), sheet.getSprite(x, 0), sheet.getSprite(x, 2)};
		
		if(d == Direction.LEFT)
		{
			for(Image i : images)
			{
				i = i.getFlippedCopy(true, false);
			}
		}
		
		return images;
	}
}
