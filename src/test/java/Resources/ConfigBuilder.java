package Resources;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;


public class ConfigBuilder {
    protected static BufferedReader Reader;
    public static final String PathConfig = "src/test/java/Resources/Config.properties";
    protected static Properties PROP;
    static String NameProp,keyProp;

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

    public static void setproperty(String NameProp, String keyProp) {
        String Str = null;
        try {
            Str = getproperty(NameProp);
            PROP = new Properties();
            OutputStream output = new FileOutputStream(PathConfig + "src/test/java/Resources/Config.properties");
            PROP.setProperty(NameProp, keyProp);
        } catch (Exception exp) {
            exp.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + "src/test/java/Resources/Config.properties");
        }
        System.out.println(Str);
    }
}



