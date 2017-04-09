package com.nasa.mars.service;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nasa.mars.impl.MarsSettingsImpl;
import com.nasa.mars.interfaces.MarsSettings;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;
  
@RestController
public class MarsRestController {
	
	public static String START_MARS = "Start to explore Mars: \nL (Rotation to Left); \nR (Rotation to Right); \nM (Move); \nExample: rest/mars/MML";
 	
	@RequestMapping(value = "/rest/mars/{commands}", method = RequestMethod.POST)
 	public ResponseEntity<?> mars(@PathVariable("commands") String commands) {

 		MarsSettings mars = new MarsSettingsImpl();
 		try {
 			return new ResponseEntity<>(mars.settingsAndExecuteCommands(commands).getPosition(), HttpStatus.OK);
 		} catch (InvalidCommandException e) {
 			return new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
 		} catch (InvalidPositionException e) {
 			return new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
 		}
 	}
 	
 	@RequestMapping(value = "/rest/mars/", method = RequestMethod.POST)
 	public ResponseEntity<?> mars() {
 		return new ResponseEntity<>(MarsRestController.START_MARS, HttpStatus.OK);
 	}
 	
}