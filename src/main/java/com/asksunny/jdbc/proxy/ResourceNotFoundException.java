package com.asksunny.jdbc.proxy;

import java.sql.SQLException;

public class ResourceNotFoundException extends SQLException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {		
	}

	public ResourceNotFoundException(String reason) {
		super(reason);	
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);		
	}

	public ResourceNotFoundException(String reason, String SQLState) {
		super(reason, SQLState);	
	}

	public ResourceNotFoundException(String reason, Throwable cause) {
		super(reason, cause);		
	}

	public ResourceNotFoundException(String reason, String SQLState,
			int vendorCode) {
		super(reason, SQLState, vendorCode);		
	}

	public ResourceNotFoundException(String reason, String sqlState,
			Throwable cause) {
		super(reason, sqlState, cause);		
	}

	public ResourceNotFoundException(String reason, String sqlState,
			int vendorCode, Throwable cause) {
		super(reason, sqlState, vendorCode, cause);		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
