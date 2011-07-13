package monsterdudes.worldmap;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import monsterdudes.Camera;
import monsterdudes.monsters.Player;
import monsterdudes.worldmap.entities.*;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class WorldMap extends TiledMap
{	
	public List<Point> blocked = new ArrayList<Point>();
	public List<Entity> entities = new ArrayList<Entity>();
	
	public PlayerEntity player = new PlayerEntity(this, new Player());
	public Camera cam;
	
	public WorldMap(String file) throws SlickException
	{
		super(file);
		
		addEntity(new BadEntity(), 5, 10);
		
		init();
	}
	
	public Entity addEntity(Entity e, float x, float y)
	{
		if(e == null) System.out.println("What");
		
		System.out.println("1");
		
		e.init(this, x, y);
		
		System.out.println("2");
		
		entities.add(e);
		
		System.out.println("3");
		
		return e;
	}
	
	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		for(Entity e : entities)
		{
			e.update(c, game, delta);
		}
	}
	
	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		for(Entity e : entities)
		{
			e.render(c, game, g);
		}
	}
	
	public void init()
	{
		for(int x = 0; x < getWidth(); x++)
		{
			for(int y = 0; y < getHeight(); y++)
			{
				int id = getTileId(x, y, 1);
				
				boolean block = ("true").equals(getTileProperty(id, "blocked", "false"));
				
				if(block)
				{
					blocked.add(new Point(x, y));
				}
			}
		}
	}
	
	public boolean isWalkable(float x, float y)
	{
		if(x < 0 || x >= getWidth() || y < 0 || y >= getHeight())
		{
			return false;
		}
		
		for(Entity e : entities)
		{
			if(e.x == x && e.y == y)
			{
				return false;
			}
		}
		
		if(blocked.contains(new Point((int) Math.floor(x), (int) Math.floor(y))))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
