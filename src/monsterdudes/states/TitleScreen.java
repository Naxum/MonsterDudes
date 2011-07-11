package monsterdudes.states;

import monsterdudes.Game;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class TitleScreen implements GameState
{
	public Animation human;
	public SpriteSheet sheet;
	
	public int getID()
	{
		return Game.TITLE_ID;
	}

	public void init(GameContainer c, StateBasedGame game) throws SlickException
	{
		try
		{
			sheet = new SpriteSheet("res/sheet.png", 15, 26);
			human = new Animation();
			human.setAutoUpdate(true);
			
			for(int i = 0; i < 8; i++)
			{
				human.addFrame(sheet.getSprite(i, 0), 100);
			}
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	}
	
	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		g.drawString("Hey errybody!", 100, 100);
		human.draw(50, 50);
	}

	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
	}
	
	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3)
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
	public void enter(GameContainer c, StateBasedGame game) throws SlickException
	{
	}

	@Override
	public void leave(GameContainer c, StateBasedGame game) throws SlickException
	{
	}

}
