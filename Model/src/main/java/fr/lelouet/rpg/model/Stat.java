package fr.lelouet.rpg.model;

/**
 * long anme and short name. eg : dexterity (DEX)
 * 
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 *
 */
public class Stat {

	@SuppressWarnings("unused")
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Stat.class);

	/**
	 * lower case description
	 */
	public final String name;

	/**
	 * upper case short description
	 */
	public final String abbr;

	public Stat(String name) {
		this.name = name.toLowerCase();
		abbr = name.toUpperCase();
	}

	public Stat(String name, String abbr) {
		this.name = name.toLowerCase();
		this.abbr = abbr.toUpperCase();
	}
}
