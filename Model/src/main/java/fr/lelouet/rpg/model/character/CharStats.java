/**
 *
 */
package fr.lelouet.rpg.model.character;

import fr.lelouet.rpg.model.RPGGame;
import fr.lelouet.rpg.model.internal.ARPGElement;

/**
 * A set of Stats that define a character,
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public class CharStats extends ARPGElement {

	public CharStats(RPGGame game) {
		super(game);
	}

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CharStats.class);

	/**
	 * dexterity is the ability to do small thing
	 */
	public int dex;

	/**
	 * power is the ability to do things big
	 */
	public int pow;

	/**
	 * defense is the resilience to one physical attacks
	 */
	public int def;

	/**
	 * Hit Points are the capacity to resist to attacks
	 */
	public int hps;

	/**
	 * vitality means the global resistence to effects
	 */
	public int vit;

	/**
	 * regeneration is the ability to go back to max HPs
	 */
	public int reg;

	/**
	 * speed is how fast a physical action can be performed
	 */
	public int spd;

	/**
	 * endurance is how many actions can be performed in a short time
	 */
	public int end;

	/**
	 * Intelligence is how fast a intellectual action can be performed
	 */
	public int itl;

	/**
	 * concentration is how many intellectual actions can be performed in a short
	 * time.
	 */
	public int cct;

	/**
	 * focus is the ability to perform an action in a disturbing environment
	 */
	public int fcs;

	/**
	 * awareness it the ability to notice things not under focus
	 */
	public int awn;

}
