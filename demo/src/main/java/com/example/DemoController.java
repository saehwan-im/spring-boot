package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET, value ="/EasiTupid")
	public String imTupid() {
		return "EasiTupid is a bad bootcamp student!";
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/WalmarTupid")
	public String walmarTupid() {
		return "WalmarTupid is a bad bootcamp teacher!";
	}

}
