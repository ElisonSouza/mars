package com.nasa.mars;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
 
import com.nasa.mars.service.MarsRestController;
 
public class MarsRestControllerTest {
 	
 	private MarsRestController marsRest;
 	
 	@Before
 	public void setup() {
 		marsRest = new MarsRestController();
 	}
 	
 	@Test
 	public void testMarsRest() {
 		ResponseEntity<?> response = marsRest.mars("MMRMMRMM");	
 		ResponseEntity<?> expected = new ResponseEntity("(2, 0, S)", HttpStatus.OK);
 		Assert.assertEquals(expected,response);
 	}
 	
 	@Test 
 	public void testInvalidCommand() {
 		ResponseEntity<?> response = marsRest.mars("AAA");
 		ResponseEntity<?> expected = new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
 		Assert.assertEquals(expected, response);
 	}
 	
 	@Test 
 	public void testInvalidPosition() {
 		ResponseEntity<?> response = marsRest.mars("MMMMMMMMMMMMMMMMMMMMMMMM");
 		ResponseEntity<?> expected = new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
 		Assert.assertEquals(expected, response);
 	}
 	
 	@Test 
 	public void testStartMars() {
 		ResponseEntity<?> response = marsRest.mars();
 		ResponseEntity<?> expected = new ResponseEntity<>(MarsRestController.START_MARS, HttpStatus.OK);
 		Assert.assertEquals(expected, response);
 	}
 	
}