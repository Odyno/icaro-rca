package net.staniscia.rca;


public interface View extends Content{

	/**
	 * The Enum VIEW_ANCHOR.
	 */
	enum VIEW_ANCHOR {

		/** The left. */
		LEFT,
		/** The right. */
		RIGHT,
		/** The bottom. */
		BOTTOM,
		/** The top. */
		TOP
	}

	/**
	 * The Enum VIEW_TYPE.
	 */
	enum VIEW_TYPE {

		/** The sliding. */
		SLIDING,
		/** The floating. */
		FLOATING,
		/** The docked. */
		DOCKED,
		/** The floating free. */
		FLOATING_FREE,
		/** The floating live. */
		FLOATING_LIVE
	}

	/**
	 * Gets the default position.
	 * 
	 * @return the default position
	 */
	 VIEW_ANCHOR getDefaultPosition();

	/**
	 * Gets the default type.
	 * 
	 * @return the default type
	 */
	VIEW_TYPE getDefaultType();

}