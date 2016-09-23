//Using BeanPostProcessor concept implement without using order interface 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylTestClass {

		public static void main(String[] args){
			ApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCylConfig.xml");
			((AbstractApplicationContext)context).registerShutdownHook();
			LifeCycle obj =(LifeCycle) context.getBean("LifecycleBean");
			obj.GreedEmployee();
		}
		}


