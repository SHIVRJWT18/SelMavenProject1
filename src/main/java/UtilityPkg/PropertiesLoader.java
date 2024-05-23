package UtilityPkg;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	private static String Filepath = "F:\\SHIV NEWSCRIPTS\\SelMavenProject1\\src\\main\\java\\ConfigPkg\\BaseEnvironment.properties";

    public static String getProperties(String Key) throws IOException
    {
     Properties prop = new Properties();
     
     FileInputStream fis = new FileInputStream(Filepath);
     
     prop.load(fis);
     
     String property = prop.getProperty(Key);
     
     return property;    
    }


}
