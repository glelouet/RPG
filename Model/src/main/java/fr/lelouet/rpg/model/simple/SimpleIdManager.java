package fr.lelouet.rpg.model.simple;

import fr.lelouet.rpg.model.internal.IdManager;

/**
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public class SimpleIdManager implements IdManager {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SimpleIdManager.class);

	private long lastId = 0;

	@Override
	public synchronized long nextId() {
		return ++lastId;
	}

	@Override
	public synchronized int reserveIds(long[] table) {
		for (int i = 0; i < table.length; i++) {
			table[i] = ++lastId;
		}
		return table.length;
	}
}
