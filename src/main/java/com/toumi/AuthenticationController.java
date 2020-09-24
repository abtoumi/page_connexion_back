/**
 * 
 */
package com.toumi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Toumi
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/authentication")
@RestController
public class AuthenticationController {
	private static final String LOGIN = "SOPRA";
	private static final String PASSWORD = "1234";
	@RequestMapping(value = "/login", method= RequestMethod.POST)
	public ResponseEntity<?> createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		AuthenticationResponse response = new AuthenticationResponse();
		if(PASSWORD.equals(authenticationRequest.getPassword()) && LOGIN.equals(authenticationRequest.getUsername())) {
			response.setFirstName("Abdennasser");
			response.setId(1L);
			response.setLastName("Toumi");
		}else{
			response = null;
		}
		
		return  ResponseEntity.ok(response);
	}
}
