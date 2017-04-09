package com.nasa.mars.validation;
 
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public class PositionValidate {
	
 	public int validateX(MarsRobot robot, int x) throws InvalidPositionException {
 		if (x >=0 && x <= robot.getXMax()) {
 			return x;
 		} else {
 			throw new InvalidPositionException();
 		}	
 	}
 	
 	public int validateY(MarsRobot robot, int y) throws InvalidPositionException {
 		if (y >= 0 && y <= robot.getYMax()) {
 			return y;
 		} else {
 			throw new InvalidPositionException();
 		}		
 	}
}