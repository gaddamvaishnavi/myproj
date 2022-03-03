package DateTimeService;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateService implements IdateService {
	
	@Override
	public String getCurrentTime() {
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
                      Date date = new Date();  
                      
                      return formatter.format(date);
	}
	
	public void getDateTime() {
		
	  java.util.Date date = new java.util.Date(); 
	  
	        System.out.println(date);
	}
	
	

	

}
