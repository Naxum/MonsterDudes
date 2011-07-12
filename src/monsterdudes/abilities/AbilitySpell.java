package monsterdudes.abilities;

public abstract class AbilitySpell extends Ability
{
	public int damage = 0;
	
	/**
	 * Outputs modified damage based on intelligence
	 * @param intelligence
	 * @return modified damage
	 */
	public abstract int calculateDamage(int intelligence);
}
