package com.Ecommerce.SkillRary.genericlibs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author QSP
 *
 */

public class Propertyfile implements AutoConstant{
	/**
	 * Read the data from propertyfile
	 * @param keys
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public static String getPropertydata(String keys) throws FileNotFoundException, IOException {
	
		Properties p=new Properties();
	    p.load(new FileInputStream(propertyfilepath));
	    return p.getProperty(keys);
		
	}

}
