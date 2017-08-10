package se.drwp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import se.drwp.quote.tss.Credentials;
import se.drwp.quote.tss.Token;
import se.drwp.quote.tss.User;
import se.drwp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("credentials", new Credentials());
		return "login-page";
	}
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute Credentials credentials, Model model) throws Exception {
		Token token = userService.loginUser(credentials);
		model.addAttribute("token", token);
		
		return "logedin-page";
	}
	
	@GetMapping("/signup")
	public String showSignupPage(Model model) throws Exception {
		//userService.createUser(TestUser.createTestUser());
		model.addAttribute("user", new User());
		return "signup-page";
	}
	
	@PostMapping("/createUser") 
	public String createUser(@ModelAttribute User user) throws Exception{
		
		user = userService.createUser(user);
				
		return "user-created";
	}
	

}
