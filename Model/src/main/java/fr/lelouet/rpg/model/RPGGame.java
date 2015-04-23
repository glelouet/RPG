package fr.lelouet.rpg.model;

import java.util.Set;

/**
 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
 */
public interface RPGGame {

	/**
	 * @return the (constant) set of races available to characters in the game
	 */
	public Set<Race> getRaces();

	/**
	 * @return the constant set of stats that define a character
	 */
	public Set<Stat> getStats();

	/**
	 * generates a new id. This should be used scarcely because it can lead to
	 * many synchronization calls. In case we need several IDs, calling
	 * {@link #reserveIds(long[])} may be more efficient.
	 *
	 * @return a new long higher than any already returned before, and not null
	 *         (min is 1)
	 */
	public long nextId();

	/**
	 * reserve several Ids to be used later. This is faster than chaining calls to
	 * nextId()
	 *
	 * @param table
	 *          the table of longs to fill
	 * @return the number of ids that were put in the table (ie, the size of the
	 *         sub-array containing ids)
	 */
	public int reserveIds(long[] table);

	/**
	 * recycle the ids that have NOT been allocated to any object. default
	 * implementation does nothing
	 *
	 * @param ids
	 *          the ids reserved and not used
	 * @param firstIdx
	 *          the first index of ids to free
	 * @param lastIdx
	 *          the last index of the ids to free
	 */
	public default void recycleIds(long[] ids, int firstIdx, int lastIdx) {
	}

	/**
	 * handler of ids backed on a {@link RPGGame}. is NOT synchronized.
	 *
	 * @author Guillaume Le Louët [guillaume.lelouet@gmail.com] 2015
	 */
	public class BufferedIdManager {

		final long[] buffer;
		final RPGGame parent;

		/** last id returned */
		protected int idx = -1;

		/** number of ids stored in buffer */
		protected int size = 0;

		public BufferedIdManager(RPGGame parent, int size) {
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

	/**
	 *
	 * @param vit
	 *          the vitality of a character
	 * @return the number of HPs associated to given value of vitality ; default
	 *         is 10*vit
	 */
	public default int maxHPs(int vit) {
		return vit * 10;
	}

}
