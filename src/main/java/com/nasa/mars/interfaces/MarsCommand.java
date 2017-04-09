package com.nasa.mars.interfaces;
 
import com.nasa.mars.enums.CardinalPointsEnum;
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public interface MarsCommand {
	 
	public MarsRobot move(MarsRobot robot) throws InvalidPositionException;
	
	public CardinalPointsEnum rotationRight(CardinalPointsEnum orientation);
 
 	public CardinalPointsEnum rotationLeft(CardinalPointsEnum orientation); 	
 	
}