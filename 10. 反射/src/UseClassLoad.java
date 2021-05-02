import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UseClassLoad {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
//            fileInputStream = new FileInputStream("dpbc.properties");
            ClassLoader classLoader = UseClassLoad.class.getClassLoader();
            inputStream = classLoader.getResourceAsStream("dpbc2.properties");
            properties.load(inputStream);
            System.out.println(properties.getProperty("user"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("what"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readConfigByProperties() {
        FileInputStream fileInputStream = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream("dpbc.properties");

            properties.load(fileInputStream);
            System.out.println(properties.getProperty("user"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("what"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
