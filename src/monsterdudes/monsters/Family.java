package monsterdudes.monsters;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public enum Family
{
	BEAST,
	DEVIL,
	UNDEAD,
	SLIME,
	DRAGON,
	PLANT,
	CONSTRUCT,
	AERIAL,
	BUG,
	BOSS;
	
	private Image icon;
	
	private static int count = 0;
	private static SpriteSheet sheet;
	
	static 
	{
		try
		{
			sheet = new SpriteSheet("res/family_icons.png", 16, 16);
		}
		catch (SlickException e)
		{
			System.out.println("Error loading Family Sprite Sheet.");
			e.printStackTrace();
		}
	}
	
	Family()
	{
		init();
	}
	
	private void init()
	{
		icon = sheet.getSprite(count, 0);
		count++;
	}
	
	public Image getImage()
	{
		return icon;
	}
}
