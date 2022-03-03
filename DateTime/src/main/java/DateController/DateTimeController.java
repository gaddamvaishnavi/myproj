package DateController;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DateTimeController {
	
	@Autowired
	private IdateService sample;
	
	@GetMapping("/CurrentTime")
	 public String getCurrentTime() {
		
		return sample.getCurrentTime() ;
		
		
	}

	 @GetMapping("/DateandTime")
	   public String getDateTime() {
		 
		   return sample.getDateTime();
				  
	 }
	 
	 
	 
	
	}


