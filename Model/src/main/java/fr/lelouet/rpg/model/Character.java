package fr.lelouet.rpg.model;

import fr.lelouet.rpg.model.links.ASystemElement;

public class Character extends ASystemElement {

	public Character(RPGGame system) {
		super(system);
	}

	/**
	 *
	 * @return true if this character is an avatar
	 */
	public boolean isPlayer() {
		return true;
	}

	protected int dex = 0;

	protected int pow = 0;

}
