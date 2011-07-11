package monsterdudes;

import monsterdudes.states.*;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame
{
	/**
	 * A Boy and His Monster Dudes!
	 */
	private static final long serialVersionUID = 6177004059241983440L;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final boolean DEBUG = true;
	
	public static final int SPLASH_ID = 0;
	public static final int TITLE_ID = 1;
	public static final int TEST_ID = 2;
	
	public Game()
	{
		super("Monster Dudes");
	}
	
	public void initStatesList(GameContainer c) throws SlickException
	{
		addState(new SplashScreen());
		addState(new TitleScreen());
		addState(new TestState());
	}
	
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer app = new AppGameContainer(new Game());
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(60);
			app.setMinimumLogicUpdateInterval(20);
			app.setMaximumLogicUpdateInterval(20);
			app.setShowFPS(DEBUG);
			app.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
	}
}
