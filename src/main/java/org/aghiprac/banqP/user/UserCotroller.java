package org.aghiprac.banqP.user;

import java.security.Principal;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aghiprac.banqP.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCotroller {

	@Autowired
	private UserService service;


	
    @RequestMapping("/test")
    public String user() {
    	return "hello";
       
    }
	
	
	
}
