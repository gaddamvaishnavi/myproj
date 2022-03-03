package DateController;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DateTimeController {
	
	//@Autowired
	//private IdateService sample;
	
	@GetMapping("/CurrentTime")
	 public String getCurrentTime() {
		
		return getCurrentTime() ;
		
		
	}

	 @GetMapping("/DateandTime")
	   public Date getDateTime() {
		 
		   return  getDateTime();
		  			  
	 }
	 
	 @GetMapping("/IST")
	 public String getIst() {
		 
		 return getIst();
		 
	 } 
	 
	 @GetMapping("/home")
	 public String Home() {
		 return "hello";
	 }
	 
	 
	 
	 
	 
	 
	 
	
	}


