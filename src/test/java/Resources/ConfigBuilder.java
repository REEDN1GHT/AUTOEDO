package Resources;

import java.io.*;
import java.util.Properties;


public class ConfigBuilder {
    protected static BufferedReader Reader;
    public static final String PathConfig = "src/test/java/Resources/Config.properties";
    protected static Properties PROP;

    public static String getproperty(String key) {
        try {
            Reader = new BufferedReader(new FileReader(PathConfig));
            PROP = new Properties();
            try {
                PROP.load(Reader);
                Reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + "src/test/java/Resources/Config.properties");
        }
        return PROP.getProperty(key); }
    }



