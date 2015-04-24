package fr.lelouet.rpg.model.internal;

import fr.lelouet.rpg.model.RPGGame;

public abstract class ARPGElement implements RPGElement {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ARPGElement.class);

	protected RPGGame game;

	protected long id;

	public ARPGElement(RPGGame game) {
		this(game, game.id().nextId());
	}

	/**
	 * create a new element with given game container and id inside the game. if
	 * id==0, a request for new Id is made.
	 *
	 * @param game
	 * @param id
	 */
	public ARPGElement(RPGGame game, long id) {
		this.game = game;
		this.id = id == 0 ? game.id().nextId() : id;
	}

	@Override
	public RPGGame system() {
		return game;
	}

	@Override
	public long id() {
		return id;
	}
}
