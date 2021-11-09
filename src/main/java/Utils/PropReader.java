package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
    private static Properties props;

    private static void loadProperty() {
        props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Z:\\CodeBank\\rest-assured-API\\src\\resources\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String Key) { loadProperty();
       return props.getProperty(Key);
    }

}
