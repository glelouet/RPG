package fr.lelouet.rpg.model.simple;

import java.util.HashSet;
import java.util.Set;

import fr.lelouet.rpg.model.RPGGame;
import fr.lelouet.rpg.model.Race;
import fr.lelouet.rpg.model.internal.IdManager;

/**
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public class SimpleRPGGame implements RPGGame {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SimpleRPGGame.class);

	private Set<Race> races = new HashSet<Race>();

	@Override
	public Set<Race> getRaces() {
		return races;
	}

	private SimpleIdManager id = new SimpleIdManager();

	@Override
	public IdManager id() {
		return id;
	}
}
