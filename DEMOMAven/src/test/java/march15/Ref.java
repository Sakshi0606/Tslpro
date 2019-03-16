package march15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.testng.annotations.Test;

public class Ref {
  @Test
  public void f() throws Exception {
	  Class c = Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
	  Constructor[] cs = c.getConstructors();
	  for(Constructor u : cs)
	  {
		  System.out.println(u.getName());
	  }
	  Field[] DF=c.getDeclaredFields();
	  for(Field F : DF)
	  {
		  System.out.println(F.getName());
	  }
	  System.out.println(c.getSuperclass());
	  Method [] MD=c.getMethods();
	  for(Method m : MD)
	  {
		  System.out.println(m.getName());
		  Parameter PM[]=m.getParameters();
		  for(Parameter P:PM)
		  {
			  System.out.println(P.getParameterizedType()+" ");
			  System.out.println(P.getName()+" ");
		  }
	  }
  }
}
