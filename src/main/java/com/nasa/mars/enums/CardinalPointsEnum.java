package com.nasa.mars.enums;
 
public enum CardinalPointsEnum {
 
 	NORTH('N'), 
 	SOUTH('S'), 
 	EAST('E'), 
 	WEST('W');
 	
 	private char code;
 
 	private CardinalPointsEnum(char code) {
 		this.code = code;
 	}
 
 	public char getCode() {
 		return this.code;
 	}
 	
}