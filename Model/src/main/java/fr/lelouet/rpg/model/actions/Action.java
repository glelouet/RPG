package fr.lelouet.rpg.model.actions;

import fr.lelouet.rpg.model.internal.RPGElement;

/**
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public interface Action extends RPGElement {

	ActionType getType();

	/**
	 * @param performer
	 *          the character who wants to perform the action
	 * @return true if the action is allowed
	 *
	 */
	boolean check(Character performer);

	void perform(Character performer);

}
