package fr.lelouet.rpg.model.internal;

import fr.lelouet.rpg.model.RPGGame;

/**
 * handler of ids backed on a {@link RPGGame}. is NOT synchronized.
 *
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 */
public class BufferedIdManager {

	final long[] buffer;
	final IdManager parent;

	/** last id returned */
	protected int idx = -1;

	/** number of ids stored in buffer */
	protected int size = 0;

	public BufferedIdManager(IdManager parent, int size) {
		buffer = new long[size];
		this.parent = parent;
	}

	/**
	 * get next Id. if the pool of free ids is empty
	 *
	 * @return
	 */
	public long nextId() {
		idx++;
		if (idx >= size - 1) {
			resplenish();
		}
		return buffer[idx];
	}

	protected void resplenish() {
		size = parent.reserveIds(buffer);
		idx = 0;
	}

	@Override
	protected void finalize() throws Throwable {
		parent.recycleIds(buffer, idx + 1, size - 1);
	}

}