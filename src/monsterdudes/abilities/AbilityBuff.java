package monsterdudes.abilities;

public abstract class AbilityBuff extends Ability
{
	public int attack = 0;
	public int defense = 0;
	public int agility = 0;
	public int intelligence = 0;
	
	public float duration = 0;
	public float chance = 0;
	
	public String beforeText;
	public String duringText;
	public String afterText;
}
