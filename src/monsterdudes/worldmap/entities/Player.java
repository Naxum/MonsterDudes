package monsterdudes.worldmap.entities;

import java.util.ArrayList;
import java.util.List;

import monsterdudes.monsters.beasts.*;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entity
{
	public List<MonsterEntity> followingMonsters = new ArrayList<MonsterEntity>();
	
	public Player() throws SlickException
	{
		super("res/badplayer.png");
		
		followingMonsters.add(new MonsterEntity(new CavePotato()));
	}
	
	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		super.update(c, game, delta);
		
		if(moving)
		{
			float lastX = Math.round(x);
			float lastY = Math.round(y);
			
			for(MonsterEntity m : followingMonsters)
			{
				//TODO: Follow in order!
				
				if(!m.moving)
				{
					if(m.x != lastX && m.y != lastY)
					{
						lastX = m.x; 
						lastY = m.y;
						m.move(direction);
					}
				}
			}
		}
	}
}
