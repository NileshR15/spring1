package Third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import First.Student;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a1 = new ClassPathXmlApplicationContext("Second/config.xml");
		Student s1 = (Student) a1.getBean("t1");
		s1.display();
	}

}
