package com.cg.main.fertilizer.exception;

public class FertilizerNotValid extends RuntimeException {
	private static final long serialVersionUID=1L;
	public FertilizerNotValid() {
	}

	/**
	 * 
	 * @param message
	 */
	public FertilizerNotValid(String message) {
		super(message);
	}
}