package com.nasa.mars.interfaces;
 
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public interface MarsSettings {
 	
 	public MarsRobot settingsAndExecuteCommands(String commands) throws InvalidCommandException, InvalidPositionException;
 	
}