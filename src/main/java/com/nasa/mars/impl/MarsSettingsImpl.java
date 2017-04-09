package com.nasa.mars.impl;
 
import com.nasa.mars.enums.CommandsEnum;
import com.nasa.mars.enums.CardinalPointsEnum;
import com.nasa.mars.interfaces.MarsCommand;
import com.nasa.mars.interfaces.MarsSettings;
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public class MarsSettingsImpl implements MarsSettings {
 	
 	private MarsRobot marsRobot;
 	
 	public MarsRobot settingsAndExecuteCommands(String commands) throws InvalidCommandException, InvalidPositionException {

 		marsRobot = new MarsRobot(0, 0, 4, 4, CardinalPointsEnum.NORTH);
 		
 		for (char command: commands.toCharArray()) {
 			setMarsRobotPositions(CommandsEnum.getCommandFromCode(command));
 		}
 		
 		return marsRobot;
 	}
 	
 	private void setMarsRobotPositions(CommandsEnum command) throws InvalidPositionException {
 		MarsCommand marsCommand = new MarsCommandImpl();
 			
 		switch (command) {
 			case MOVE:				
				MarsRobot robotNew = marsCommand.move(marsRobot);
				marsRobot.setX(robotNew.getX());
				marsRobot.setY(robotNew.getY());
				break;
 			case RIGHT:
 				marsRobot.setCardinalPoint(marsCommand.rotationRight(marsRobot.getCardinalPoint()));
 				break;
 			case LEFT:
 				marsRobot.setCardinalPoint(marsCommand.rotationLeft(marsRobot.getCardinalPoint()));		
 				break; 			
 			default:
 				break;
 		}
 	}

}