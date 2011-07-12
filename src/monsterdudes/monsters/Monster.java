package monsterdudes.monsters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;

import monsterdudes.abilities.Ability;
import monsterdudes.buffs.Buff;
import monsterdudes.worldmap.entities.Entity.Direction;

/**
 * Represents a base class for a monster, including all of its stats. Extend this class to create a monster.
 * @author Jacob Sawyer
 *
 */
public abstract class Monster
{
	public Image image;
	public Animation attackAnimation;
	public Animation attackCriticalAnimation;
	public Animation magicAnimation; 
	
	public static final float ANIMATION_TIME = 2;
	
	public Map<Direction, Image[]> walkAnimation = new HashMap<Direction, Image[]>();
	
	public int health;
	public int maxHealth;
	
	public int mana;
	public int maxMana;
	
	public int level;
	public int exp;
	public int maxExp;
	
	public List<Ability> abilities = new ArrayList<Ability>();
	public List<Buff> buffs = new ArrayList<Buff>();
	
	public Strategy strategy;
	//public Personality personality;
	public Family family;
}
