package fr.lelouet.rpg.model.actions;

/**
 * The different kind of action.
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public enum ActionType {
	/** only applies on effect on self. example : eat, sleep */
	SELF,
	/** applies an effect around self. exemple : heat, scream */
	ZONE,
	/** applies effect on one target. example : attack, talk */
	TARGET,
	/**
	 * applies an effect on given location. example : drop object, create portal
	 * potential
	 */
	AIM

}
