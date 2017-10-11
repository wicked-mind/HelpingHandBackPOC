package com.helpinghand.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.helpinghand.controller.UserController;

/**
 * This class used for unit testing for UserController.
 *
 * @author Gourav
 */

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webAppContext;
	
	/**
	 * Method to setup the mockMvc
	 * @param 
	 * @return 
	 * @throws 
	 */
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
	}
	
	/**
	 * Test Method for user registration URL validation
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Test
	public void validateRegisterUserURLMap() throws Exception {
		mockMvc.perform(get("/helpinghandservice/registerUser")).andExpect(status().isOk());
	}

}
