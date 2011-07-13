package monsterdudes.worldmap.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class BadEntity extends Entity
{
	public BadEntity() throws SlickException
	{
		image = new Image("res/badplayer.png", false, Image.FILTER_NEAREST);
	}
}
