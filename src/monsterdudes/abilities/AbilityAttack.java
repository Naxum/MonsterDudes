package monsterdudes.abilities;

public abstract class AbilityAttack extends Ability
{
	public int damage = 0;
	
	/**
	 * Outputs modified damage based on strength and intelligence.
	 * @param strength
	 * @param intelligence
	 * @return
	 */
	public abstract int calculateDamage(int strength, int intelligence);
}
