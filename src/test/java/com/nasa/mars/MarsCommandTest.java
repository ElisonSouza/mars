package com.nasa.mars;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nasa.mars.enums.CardinalPointsEnum;
import com.nasa.mars.impl.MarsCommandImpl;
import com.nasa.mars.interfaces.MarsCommand;
import com.nasa.mars.model.MarsRobot;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
public class MarsCommandTest {
 
 	private MarsCommand marsCommand;
 
 	@Before
 	public void setup() {
 		marsCommand = new MarsCommandImpl();
 	}
 	
 	@Test
 	public void testRotateLeftNorthWest() {
 		Assert.assertEquals(CardinalPointsEnum.WEST, marsCommand.rotationLeft(CardinalPointsEnum.NORTH));
 	}
 	
 	@Test
 	public void testRotateLeftSouthEast() {
 		Assert.assertEquals(CardinalPointsEnum.EAST, marsCommand.rotationLeft(CardinalPointsEnum.SOUTH));
 	}
 	
 	@Test
 	public void testRotateLeftEastNorth() {
 		Assert.assertEquals(CardinalPointsEnum.NORTH, marsCommand.rotationLeft(CardinalPointsEnum.EAST));
 	}
 	
 	@Test
 	public void testRotateLeftWestNorth() {
 		Assert.assertEquals(CardinalPointsEnum.SOUTH, marsCommand.rotationLeft(CardinalPointsEnum.WEST));
 	}
 	
 	@Test
 	public void testRotateRightNorthEast() {
 		Assert.assertEquals(CardinalPointsEnum.EAST, marsCommand.rotationRight(CardinalPointsEnum.NORTH));
 	}
 	
 	@Test
 	public void testRotateRightWestNorth() {
 		Assert.assertEquals(CardinalPointsEnum.NORTH, marsCommand.rotationRight(CardinalPointsEnum.WEST));
 	}
 	
 	@Test
 	public void testRotateRightSouthWest() {
 		Assert.assertEquals(CardinalPointsEnum.WEST, marsCommand.rotationRight(CardinalPointsEnum.SOUTH));
 	}
 	
 	@Test
 	public void testRotateRightEastSouth() {
 		Assert.assertEquals(CardinalPointsEnum.SOUTH, marsCommand.rotationRight(CardinalPointsEnum.EAST));
 	}
 	
 	@Test 
 	public void testMoveNorth() {
 		MarsRobot robot = new MarsRobot(0, 0, 4, 4, CardinalPointsEnum.NORTH);
 		robot = marsCommand.move(robot);
 		
 		Assert.assertEquals(0, robot.getX());
 		Assert.assertEquals(1, robot.getY());
 		Assert.assertEquals(CardinalPointsEnum.NORTH, robot.getCardinalPoint());
 	}
 	
 	@Test 
 	public void testMoveWest() {
 		MarsRobot robot = new MarsRobot(1, 1, 4, 4, CardinalPointsEnum.WEST);
 		robot = marsCommand.move(robot);
 		
 		Assert.assertEquals(0, robot.getX());
 		Assert.assertEquals(1, robot.getY());
 		Assert.assertEquals(CardinalPointsEnum.WEST, robot.getCardinalPoint());
 	}
 	
 	@Test(expected = InvalidPositionException.class)
 	public void testMoveInvalidPositionException() throws InvalidPositionException {
 		MarsRobot robot = new MarsRobot(-2, 1, 4, 4, CardinalPointsEnum.WEST);
 		marsCommand.move(robot);
 	}
 	
}