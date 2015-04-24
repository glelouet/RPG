package fr.lelouet.rpg.model;

import fr.lelouet.rpg.model.character.CharStats;
import fr.lelouet.rpg.model.internal.RPGElement;

/**
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public interface Race extends RPGElement {

	public CharStats stats();

}
