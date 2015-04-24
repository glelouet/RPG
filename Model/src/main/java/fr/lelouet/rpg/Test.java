package fr.lelouet.rpg;

import fr.lelouet.rpg.model.simple.SimpleRPGGame;

/**
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public class Test {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Test.class);


	public static void main(String[] args) {
		SimpleRPGGame game = new SimpleRPGGame();
		game.id();
	}
}
