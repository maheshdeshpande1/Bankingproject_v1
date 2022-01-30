package pkj1;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.testng.annotations.Test;

public class elementvisible 
{
	@Test
public void loggetest()
{
	final org.apache.log4j.Logger logger = LogManager.getLogger(elementvisible.class);  
	   
	  // basic log4j configurator  
	  BasicConfigurator.configure();  
	  logger.info("Hello world");  
	  logger.info("we are in logger info mode");  
	  logger.error("this is error");
	  
	   
}
}