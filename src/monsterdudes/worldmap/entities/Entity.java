package monsterdudes.worldmap.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import monsterdudes.Game;
import monsterdudes.worldmap.WorldMap;

public class Entity
{
	public WorldMap map;
	public Image image;
	public float x;
	public float y;
	
	public boolean moving = false;
	public Direction direction = Direction.DOWN;
	public float moveNewTile = 0;
	
	/*
	public Entity(String str) throws SlickException
	{
		image = new Image(str, false);
	}*/
	
	public void init(WorldMap map, float x, float y)
	{
		this.map = map;
		this.x = x;
		this.y = y;
	}
	
	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		if(moving)
		{
			float update = delta * 0.002f;
			moveNewTile += update;
			
			if(moveNewTile >= 1)
			{
				update -= moveNewTile % 1;
				moveNewTile = 1;
				moving = false;
			}
			
			if(direction == Direction.DOWN)
			{
				y += update;
			}
			else if (direction == Direction.UP)
			{
				y -= update;
			}
			else if (direction == Direction.LEFT)
			{
				x -= update;
			}
			else if (direction == Direction.RIGHT)
			{
				x += update;
			}
			
			if(!moving)
			{
				x = (float)Math.round(x);
				y = (float)Math.round(y);
			}
		}
	}
	
	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		image.draw(x * Game.TILE_SIZE, y * Game.TILE_SIZE);
	}
	
	public void move(Direction d)
	{
		if(moving)
		{
			return;
		}
		
		int xo = 0;
		int yo = 0;
		
		if(d == Direction.LEFT)
		{
			xo = -1;
		}
		else if (d == Direction.RIGHT)
		{
			xo = 1;
		}
		else if (d == Direction.UP)
		{
			yo = -1;
		}
		else if (d == Direction.DOWN)
		{
			yo = 1;
		}
		
		direction = d;
		
		if(map.isWalkable(x + xo, y + yo))
		{
			moving = true;
			moveNewTile = 0;
		}
	}
	
	public enum Direction 
	{
		UP,
		LEFT,
		RIGHT,
		DOWN
	}
}
