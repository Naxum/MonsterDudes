package monsterdudes.worldmap.entities;

import monsterdudes.monsters.Monster;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Represents a map entity created from a Monster. Make sure the sprites for walking are loaded within Monster.
 * @author Jacob Sawyer
 *
 */
public class MonsterEntity extends Entity
{
	public Monster monster;
	
	public MonsterEntity(Monster monster) throws SlickException
	{
		super("res/icon.png"); //PLACEHOLDER
		this.monster = monster;
	}
	
	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		super.update(c, game, delta);
		
	}
	
	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		if(moving)
		{
			monster.walkAnimation.get(direction).draw(x * 32, y * 32);
		}
		else
		{
			monster.walkAnimation.get(direction).getImage(0).draw(x * 32, y * 32);
		}
	}
}
