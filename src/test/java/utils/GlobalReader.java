package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalReader {

    private static Properties prop;

    static {
        try{
            FileInputStream fis = new FileInputStream("src/test/resources/global.properties");
            prop = new Properties();
            prop.load(fis);
        }
        catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to read global.properties");
        }
    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }

}
