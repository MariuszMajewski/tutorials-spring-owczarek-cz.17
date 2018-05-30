package pl.mrmario.tutorials.spring.owczarek.cz17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Component1 com1= context.getBean("component1", Component1.class);
		Component2 com2= context.getBean("component2", Component2.class);

		System.out.println(com1.getUsersRepository().getInstanceNumber());
		System.out.println(com2.getUsersRepository().getInstanceNumber());
		
			}
}