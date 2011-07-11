package monsterdudes.states;

import monsterdudes.Game;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class SplashScreen implements GameState
{
	public Image image;
	public float time = 0;
	public float maxTime = 2000;
	
	public void init(GameContainer c, StateBasedGame game) throws SlickException
	{
		image = new Image("res/splash.png");
	}
	
	public void render(GameContainer c, StateBasedGame game, Graphics g) throws SlickException
	{
		image.draw();
	}

	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		time += delta + 0.1f;
		
		if(time >= maxTime)
		{
			game.enterState(Game.TEST_ID, new FadeOutTransition(Color.black, 1000), new FadeInTransition(Color.black, 1000));
		}
	}
	
	public int getID()
	{
		return Game.SPLASH_ID;
	}
	
	public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException
	{
		
	}
	
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3)
	{
	}
	
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3)
	{
	}
	
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3)
	{
	}
	
	public void mousePressed(int arg0, int arg1, int arg2)
	{
	}
	
	public void mouseReleased(int arg0, int arg1, int arg2)
	{
	}
	
	public void mouseWheelMoved(int arg0)
	{
	}

	public void inputEnded()
	{
	}

	public void inputStarted()
	{
	}

	public boolean isAcceptingInput()
	{
		return false;
	}

	public void setInput(Input arg0)
	{
	}

	public void keyPressed(int arg0, char arg1)
	{
	}

	public void keyReleased(int arg0, char arg1)
	{
	}

	public void controllerButtonPressed(int arg0, int arg1)
	{
	}

	public void controllerButtonReleased(int arg0, int arg1)
	{
	}

	public void controllerDownPressed(int arg0)
	{
	}

	public void controllerDownReleased(int arg0)
	{
	}

	public void controllerLeftPressed(int arg0)
	{
	}

	public void controllerLeftReleased(int arg0)
	{
	}

	public void controllerRightPressed(int arg0)
	{
	}

	public void controllerRightReleased(int arg0)
	{
	}

	public void controllerUpPressed(int arg0)
	{
	}

	public void controllerUpReleased(int arg0)
	{
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1) throws SlickException
	{
	}

}
