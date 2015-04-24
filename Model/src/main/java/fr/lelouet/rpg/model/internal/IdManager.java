package fr.lelouet.rpg.model.internal;

public interface IdManager {

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

}
