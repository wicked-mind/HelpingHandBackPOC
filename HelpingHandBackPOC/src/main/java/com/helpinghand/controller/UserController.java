package com.helpinghand.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helpinghand.bean.ResultBean;
import com.helpinghand.constant.IConstants;

/**
 * This is the REST Controller for User operations.
 *
 * @author Gourav
 */
@RestController
@RequestMapping(value=IConstants.HELPINGHAND_SERVICE_URL)
public class UserController {
	
	@RequestMapping(value=IConstants.USER_SERVICE_URL + IConstants.REGISTER_USER_URL, method=RequestMethod.GET)
	public ResultBean registerUser() {
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}

}
