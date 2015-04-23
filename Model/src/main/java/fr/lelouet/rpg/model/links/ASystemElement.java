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

	public ASystemElement(RPGGame game, long id) {
		this.game = game;
		this.id = id;
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
