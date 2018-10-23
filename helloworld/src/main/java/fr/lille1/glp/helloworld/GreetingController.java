package fr.lille1.glp.helloworld;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingRepository greet;
	
//	private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Optional<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return greet.findById(2L);
    }

    @RequestMapping("/greetings")
    public Iterable<Greeting> greetings(@RequestParam(value="name", defaultValue="World") String name) {
        greet.findAll().forEach(g -> System.out.println(g));
    	return greet.findAll();
    }
}