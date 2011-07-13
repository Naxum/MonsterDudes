package monsterdudes.worldmap.entities;

import java.util.ArrayList;
import java.util.List;

import monsterdudes.monsters.Monster;
import monsterdudes.monsters.beasts.*;
import monsterdudes.worldmap.WorldMap;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class PlayerEntity extends MonsterEntity
{
	public List<MonsterEntity> followingMonsters = new ArrayList<MonsterEntity>();
	
	public PlayerEntity(WorldMap map, Monster playerMonster) throws SlickException
	{
		super(playerMonster);
		this.map = map;
		
		image = new Image("res/badplayer.png", false, Image.FILTER_NEAREST);
		
		CavePotato cp = new CavePotato();
		MonsterEntity me = new MonsterEntity(cp);
		
		map.addEntity(me, 7f, 6f);
		
		followingMonsters.add(me);
		
	}
	
	public void update(GameContainer c, StateBasedGame game, int delta) throws SlickException
	{
		super.update(c, game, delta);
		
		if(moving)
		{
			for(MonsterEntity m : followingMonsters)
			{
				//TODO: Follow in order!
				
				if(!m.moving)
				{
					m.move(direction);
				}
			}
		}
	}
}
