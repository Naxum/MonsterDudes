package monsterdudes.monsters.beasts;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import monsterdudes.monsters.Monster;

public class CavePotato extends Monster
{
	public CavePotato() 
	{
		super();
		//TODO: Dynamically load stats from files
		
		System.out.println("New Cave Potato");
		
	}
	
	protected void init() throws SlickException
	{
		//TODO: Load battle images
		
		sheet = new SpriteSheet("res/monsters/cavepotato.png", 32, 32);
		loadWalkingImages();
	}
}
