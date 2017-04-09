package com.nasa.mars.impl;
 
import com.nasa.mars.enums.CardinalPointsEnum;
import com.nasa.mars.interfaces.MarsCommand;
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.PositionValidate;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public class MarsCommandImpl implements MarsCommand {
 	
	public MarsRobot move(MarsRobot marsRobot) throws InvalidPositionException {
 		
 		PositionValidate positionValidate = new PositionValidate();
 		
 		switch (marsRobot.getCardinalPoint()) {
 			case NORTH:
 				marsRobot.setY(positionValidate.validateY(marsRobot, marsRobot.getY() + 1));
 				break;
 			case SOUTH:
 				marsRobot.setY(positionValidate.validateY(marsRobot, marsRobot.getY() - 1));
 				break;
 			case EAST:
 				marsRobot.setX(positionValidate.validateX(marsRobot, marsRobot.getX() + 1));
 				break;
 			case WEST:
 				marsRobot.setX(positionValidate.validateX(marsRobot, marsRobot.getX() - 1));
 				break;
 			default:
 				break;
 		} 		
 		return marsRobot;
 	}
 	
 	public CardinalPointsEnum rotationRight(CardinalPointsEnum code) {
 		switch (code) {
 			case NORTH:
 				return CardinalPointsEnum.EAST;
 			case SOUTH:
 				return CardinalPointsEnum.WEST;
 			case EAST:
 				return CardinalPointsEnum.SOUTH;
 			case WEST:
 				return CardinalPointsEnum.NORTH;
 			default:
 				return null;
 		}
 	}
 	
 	public CardinalPointsEnum rotationLeft(CardinalPointsEnum code) {
 		switch (code) {
 			case NORTH:
 				return CardinalPointsEnum.WEST;
 			case SOUTH:
 				return CardinalPointsEnum.EAST;
 			case EAST:
 				return CardinalPointsEnum.NORTH;
 			case WEST:
 				return CardinalPointsEnum.SOUTH;
 			default:
 				return null;
 		}
 	}

}