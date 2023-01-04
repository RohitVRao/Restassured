package serilization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforserilizationanddeserilization.Employee_details;

public class Serilization_of_Employee_details {

	@Test
	public void serilization_of_employee_details() throws Throwable, JsonMappingException, IOException
	{
		// create object for pojo class
		
		Employee_details ED = new Employee_details("1234", "Virat", 8088);
		
		//create object for object mapper
		
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("./emplpoyeedetails.json"), ED);
		
	}
}
