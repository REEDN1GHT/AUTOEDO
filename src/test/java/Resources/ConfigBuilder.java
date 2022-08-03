package Resources;

import java.io.*;
import java.util.Properties;


public class ConfigBuilder {
    /*protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    static {
        try {
            //указание пути до файла с настройками
            fileInputStream = new FileInputStream("src/test/java/Resources/Config.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            //обработка возможного исключения (нет файла и т.п.)
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace(); } } }
    /**
     * метод для возврата строки со значением из файла с настройками


    public static String getproperty(String key) {
        return PROPERTIES.getProperty(key); }
}*/
    protected static BufferedReader Reader;
    public static final String PathConfig = "src/test/java/Resources/Config.properties";
    protected static Properties PROP;

    public static String getproperty(String key) {
        //BufferedReader FileReader;
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



