package deserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforserilizationanddeserilization.Employee_details;

public class Deserilization_of_Employee_details {
	
	@Test
	public void deserilization() throws JsonParseException, JsonMappingException, IOException
	{
		
	
	ObjectMapper om = new ObjectMapper();
   Employee_details a = om.readValue(new File("emplpoyeedetails.json"), Employee_details.class);
   
   System.out.println(a.getEmployeeid());
   System.out.println(a.getEmployeename());
   System.out.println(a.getEmployeephonenumber());
	}
	
	
}
