package com.uis.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	// login?name=Ranga RequestParam
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.aunthenticate(name, password)) {
			model.put("name", name);

			// Authentication
			// name - uis
			// password - dummy
			return "Welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}

//	private Logger logger = LoggerFactory.getLogger(getClass());
	// login => com.uis.springboot.myfirstwebapp.login.LoginController => login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp

	// http://localhost:8080/login?name=Ranga
	// Model
//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name); //This is how we put parameters in url and executes using ModelMap.put
//		
//		logger.debug("Request param is {}", name);
//		logger.info("I want this printed at INFO level");
//		logger.warn("I want this printed at WARN level");
//		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION CODE
//
//		return "login";
//	}
}
