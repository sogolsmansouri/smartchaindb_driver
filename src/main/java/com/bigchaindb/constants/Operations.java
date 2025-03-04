/*
 * Copyright BigchainDB GmbH and BigchainDB contributors
 * SPDX-License-Identifier: (Apache-2.0 AND CC-BY-4.0)
 * Code is Apache-2.0 and docs are CC-BY-4.0
 */
package com.bigchaindb.constants;



/**
 * The Enum Operations.
 */
public enum Operations {

	/** The create. */
	CREATE("CREATE"),
	
	/** The transfer. */
	TRANSFER("TRANSFER"),
	
	/** The RFQ. */
	REQUEST_FOR_QUOTE("REQUEST_FOR_QUOTE"),

	PRE_REQUEST("PRE_REQUEST"),

	/** The interest. */
	INTEREST("INTEREST"),

	BID("BID"),

	ACCEPT("ACCEPT"),
	
	ADV("ADV"),
	UPDATE_ADV("UPDATE_ADV"),

	BUYOFFER("BUYOFFER"),

	INVERSE_TXN("INVERSE_TXN"),

	SELL("SELL"),

	ACCEPT_RETURN("ACCEPT_RETURN");

	/** The value. */
	private final String value;
	
	/**
	 * Instantiates a new operations.
	 *
	 * @param value the value
	 */
	Operations(final String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.value;
	}
}
