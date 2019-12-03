package accessPrivateMethod;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;


public class SecondClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		FirstClass fc = new FirstClass();
		
		Method m = FirstClass.class.getDeclaredMethod("show");
		m.setAccessible(true);
		m.invoke(fc);

	}

}
