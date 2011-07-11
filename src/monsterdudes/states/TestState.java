package monsterdudes.states;

import monsterdudes.Camera;
import monsterdudes.Game;
import monsterdudes.worldmap.WorldMap;
import monsterdudes.worldmap.entities.Entity.Direction;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class TestState implements GameState
{
	WorldMap map;
	float x = 7;
	float y = 5;
	
	public int getID()
	{
		return Game.TEST_ID;
	}

	public void init(GameContainer c, StateBasedGame game) throws SlickException
	{
		map = new WorldMap("res/badmap.tmx");
		map.player.init(map, x, y);
		map.cam = new Camera(x * 32 - (c.getWidth()/2), y * 32 - (c.getHeight()/2));
	}

	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		g.translate(-map.cam.x, -map.cam.y);
		map.render(0, 0);
		map.render(c, game, g);
		map.player.render(c, game, g);
		
		g.translate(map.cam.x, map.cam.y);
		
		g.setColor(Color.white);
		g.drawString("X:" + map.player.x + ", Y:" + map.player.y, 80, 10);
	}

	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		map.update(c, game, delta);
		map.player.update(c, game, delta);
		
		Direction d = null;
		
		if(c.getInput().isKeyDown(Keyboard.KEY_W))
		{
			d = Direction.UP;
		}
		else if (c.getInput().isKeyDown(Keyboard.KEY_S))
		{
			d = Direction.DOWN;
		}
		else if(c.getInput().isKeyDown(Keyboard.KEY_A))
		{
			d = Direction.LEFT;
		}
		else if (c.getInput().isKeyDown(Keyboard.KEY_D))
		{
			d = Direction.RIGHT;
		}
		
		if(d != null)
		{
			map.player.move(d);
		}
		
	}
	
	
	
	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3)
	{
	}
	
	public void leave(GameContainer c, StateBasedGame game) throws SlickException
	{
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3)
	{
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3)
	{
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2)
	{
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2)
	{
	}

	@Override
	public void mouseWheelMoved(int arg0)
	{
	}

	@Override
	public void inputEnded()
	{
	}

	@Override
	public void inputStarted()
	{
	}

	@Override
	public boolean isAcceptingInput()
	{
		return false;
	}

	@Override
	public void setInput(Input arg0)
	{
	}

	@Override
	public void keyPressed(int arg0, char arg1)
	{
	}

	@Override
	public void keyReleased(int arg0, char arg1)
	{
	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1)
	{
	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1)
	{
	}

	@Override
	public void controllerDownPressed(int arg0)
	{
	}

	@Override
	public void controllerDownReleased(int arg0)
	{
	}

	@Override
	public void controllerLeftPressed(int arg0)
	{
	}

	@Override
	public void controllerLeftReleased(int arg0)
	{
	}

	@Override
	public void controllerRightPressed(int arg0)
	{
	}

	@Override
	public void controllerRightReleased(int arg0)
	{
	}

	@Override
	public void controllerUpPressed(int arg0)
	{
	}

	@Override
	public void controllerUpReleased(int arg0)
	{
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1)
			throws SlickException
	{
	}
}
