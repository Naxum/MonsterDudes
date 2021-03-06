package monsterdudes.monsters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import monsterdudes.abilities.Ability;
import monsterdudes.buffs.Buff;
import monsterdudes.worldmap.entities.Entity.Direction;

/**
 * Represents a base class for a monster, including all of its stats. Extend this class to create a monster.
 * @author Jacob Sawyer
 *
 */
public abstract class Monster
{
	public SpriteSheet sheet;
	
	public Image image;
	public Animation attackAnimation;
	public Animation attackCriticalAnimation;
	public Animation magicAnimation; 
	
	public static final float ANIMATION_TIME = 2;
	
	public Map<Direction, Animation> walkAnimation = new HashMap<Direction, Animation>();
	
	public int health;
	public int maxHealth;
	
	public int mana;
	public int maxMana;
	
	public int level;
	public int exp;
	public int maxExp;
	
	public List<Ability> abilities = new ArrayList<Ability>();
	public List<Buff> buffs = new ArrayList<Buff>();
	
	public Strategy strategy;
	//public Personality personality;
	public Family family;
	
	public Monster()
	{
		try
		{
			init();
		}
		catch(SlickException e)
		{
			System.out.println("Error initializing monster " + getClass().getName());
			System.exit(0);
		}
	}
	
	/**
	 * Load all images here, this is called from the Monster's constructor, so use super() and all will be done for you.
	 * @throws SlickException
	 */
	protected abstract void init() throws SlickException;
	
	public Image[] getWalkSprites(Direction d)
	{
		int x = 0;
		
		if(d == Direction.RIGHT || d == Direction.LEFT)
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
			for(int i = 0; i < images.length; i++)
			{
				images[i] = images[i].getFlippedCopy(true, false);
			}
		}
		
		return images;
	}
	
	public void loadWalkingImages()
	{
		for(Direction d : Direction.values())
		{
			walkAnimation.put(d, new Animation(getWalkSprites(d), 200, false));
		}
	}
}
