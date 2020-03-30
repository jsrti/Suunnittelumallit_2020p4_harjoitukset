package abstractfactory;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
        ClothingFactory factory = null;
        Properties properties = new Properties();
        
        try (InputStream fis = Main.class.getResourceAsStream("properties")){
            properties.load(fis);
        } catch (Exception e) {
            System.out.println("File read does not work");
            e.printStackTrace();
        }

        try {
            Class<?> c = Class.forName(properties.getProperty("OLD"));
            Method factoryMethod = c.getDeclaredMethod("getInstance");
            factory = (ClothingFactory) factoryMethod.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		Wardrobe wardrobe = new Wardrobe(factory);
		wardrobe.printClothes();
		
		try {
            Class<?> c = Class.forName(properties.getProperty("NEW"));
            Method factoryMethod = c.getDeclaredMethod("getInstance");
            factory = (ClothingFactory) factoryMethod.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		wardrobe.changeClothes(factory);
		wardrobe.printClothes();	
	}

}
