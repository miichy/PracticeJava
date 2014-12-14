package annotationtry;

import java.lang.reflect.Field;

public class FruitInfoUtil {

	public static void getFruitInfo(Class<?> clazz){
		
		String strFruitName = "Name: ";
		String strFruitColor = "Color: ";
		String strFruitProvider = "Provider: ";
		
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields){
			if(field.isAnnotationPresent(FruitName.class)){
				FruitName fn = (FruitName) field.getAnnotation(FruitName.class);
				strFruitName = strFruitName + fn.value();
				System.out.println(strFruitName);
			}else if(field.isAnnotationPresent(FruitColor.class)){
				FruitColor fc = (FruitColor) field.getAnnotation(FruitColor.class);
				strFruitColor = strFruitColor + fc.fruitColor().toString();
				System.out.println(strFruitColor);
			}else if(field.isAnnotationPresent(FruitProvider.class)){
				FruitProvider fp = (FruitProvider) field.getAnnotation(FruitProvider.class);
				strFruitProvider = strFruitProvider + fp.id() + "==" + fp.name() + "===" +fp.address();
				System.out.println(strFruitProvider);
			}else{
				System.out.println("Wrong work flow into this place!");
			}
		}
		
	}
	
}
