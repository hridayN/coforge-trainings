package coforgespringexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Comment 6: This will be our spring container, to create the bean objects defined as configurations 
// in a beans.xml file
public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comment 7: Here beans.xml is the configuration metadata needed by our Spring container
		// for bean creation 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Comment 8: Here we are creating the bean with the specified id
		Address addr = (Address)context.getBean("addr");
		System.out.println("Address: " + addr);
		
		Person person = (Person) context.getBean("prsn");
		System.out.println("Person: " + person);
		
		Tutor tutor = (Tutor) context.getBean("tutr");
		System.out.println("Tutor: " + tutor);
	}

}
