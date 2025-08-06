package com.sr.Aws_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5174")
public class Controller
{
    @Autowired	
	private UserRespo userRespo;
	
	@Value("${VARIABLES_URL}")
	private String info;
	
	@GetMapping("/hello")
	public String hello(@RequestParam String name)
	{
		return "Hello "+name+" " + info; 
	}
	
	@GetMapping("/add/user")
	public String addUser(@RequestParam String name)
	{
		User user = new User();
		user.setName(name);
		user =userRespo.save(user);
		
		return "User Added Successfully ,id "+user.getId(); 
	}
	
	@GetMapping("/user")
	public String addUser(@RequestParam Integer id)
	{
		
		User user = userRespo.findById(id).orElse(null);
		
		if(user ==null)
		{
			return "User Not FOund";
		}
		
		return "User Found Name "+user.getName()+" , id"+user.getId(); 
	}
	

}
