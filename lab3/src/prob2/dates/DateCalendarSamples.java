package prob2.dates;
import java.util.*;


public class DateCalendarSamples {

  
    public static void main(String [] args) {
    	String format = "%tD";
		Date d = new Date();
		String formattedDate = String.format(format, d); // has form MM/dd/yy
		System.out.println(formattedDate);

    } 
    
}




