package fr.lelouet.rpg.model.links;

import fr.lelouet.rpg.model.RPGGame;

public abstract class ASystemElement implements SystemElement {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ASystemElement.class);

	protected RPGGame game;

	protected long id;

	public ASystemElement(RPGGame game) {
		this(game, game.nextId());
	}

	/**
	 * create a new element with given game container and id inside the game. if
	 * id==0, a request for new Id is made.
	 *
	 * @param game
	 * @param id
	 */
	public ASystemElement(RPGGame game, long id) {
		this.game = game;
		this.id = id == 0 ? game.nextId() : id;
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
