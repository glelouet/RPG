package fr.lelouet.rpg.model;

import java.util.Set;

import fr.lelouet.rpg.model.internal.IdManager;

/**
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 */
public interface RPGGame {

	/**
	 * @return the (constant) set of races available to characters in the game
	 */
	public Set<Race> getRaces();

	public IdManager id();

	/**
	 *
	 * @param vit
	 *          the vitality of a character
	 * @return the number of HPs associated to given value of vitality ; default
	 *         is 10*vit
	 */
	public default int maxHPs(int vit) {
		return vit * 10;
	}

}
