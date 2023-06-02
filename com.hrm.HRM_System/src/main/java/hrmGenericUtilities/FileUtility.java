package hrmGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is to handle File utilities
 * @author Pavan
 *
 */
public class FileUtility {
	/**
	 * This method is to get the value from the properties file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getPropertyFileKeyValue(String key) throws IOException {
	FileInputStream fileInputStream=new FileInputStream(IPathConstant.propertyFilePath);
	Properties pop=new Properties();
	pop.load(fileInputStream);
	String value=pop.getProperty(key);
	return value;
	}
	
	
}
