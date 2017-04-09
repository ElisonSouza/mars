package com.nasa.mars;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nasa.mars.enums.CardinalPointsEnum;
import com.nasa.mars.impl.MarsSettingsImpl;
import com.nasa.mars.interfaces.MarsSettings;
import com.nasa.mars.model.MarsRobot;
 
public class MarsSettingsTest {
 	
 	private MarsSettings mars;
 	
 	@Before
 	public void setup() {
 		mars = new MarsSettingsImpl();
 	}
 	
 	@Test
 	public void testSettingsAndExecuteCommands() {
 		MarsRobot robot = mars.settingsAndExecuteCommands("MML");
 		
 		Assert.assertEquals(0, robot.getX());
 		Assert.assertEquals(2, robot.getY());
 		Assert.assertEquals(CardinalPointsEnum.WEST, robot.getCardinalPoint());
 	}
 	
}