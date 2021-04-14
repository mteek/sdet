package com.tts.Subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SubscriberController {

@Autowired//how to connect repository(interface)
//to controller
private SubscriberInterface subscriberInterface;

	
	@GetMapping (value="/") 
	//value is what tells
	//getmapping
	//what its home is
	public String subscriber(Subscriber subscriber) {
		return "subscriber/index";
	}
							//templates
							//it says, when the subscriber is called
							//it's going to return this info
							//getmapping (get is an http verb)
							//and it helps tell springboot
							//what to do
							//http methods is the way we
							//talk to the browser
							//get is get but im not 
							//gonna mess with this
							//Get is an http verb
	
	
	
	
	private Subscriber subscriber;
	//this creates a new variable
	

	public String addNewSubscriber(Subscriber subscriber, Model model) {
		subscriberInterface.save(new Subscriber(subscriber.getEmail(),
				subscriber.getFirstName(),subscriber.getLastName()));
				model.addAttribute("email", subscriber.getEmail());
				model.addAttribute("firstName", subscriber.getFirstName());
				model.addAttribute("lastName", subscriber.getLastName());
				return "subscriber/result";
	}


}
	//this method^^
	




