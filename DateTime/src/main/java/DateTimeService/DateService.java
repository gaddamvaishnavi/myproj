package DateTimeService;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

@Service
public class DateService{
	
	
	public String getCurrentTime() {
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
                      Date date = new Date();  
                      
                      return formatter.format(date);
	}
	
	public Date getDateTime() {
		
	  java.util.Date date1 = new java.util.Date(); 
	          
	              return date1;
	             
	}
	
	public String getIst() {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
    TimeZone tz = TimeZone.getTimeZone("GMT+0530");
    Date d=new Date();
    sdf.setTimeZone(tz);
    String dateIST = sdf.format(d);
        return dateIST;
	} 
    
    public String getCST() { 
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");	
    TimeZone tz = TimeZone.getTimeZone("CST");
    Date d=new Date();
    sdf.setTimeZone(tz);
    
     return sdf.format(d);
	
    }
	
	
	

	

}
