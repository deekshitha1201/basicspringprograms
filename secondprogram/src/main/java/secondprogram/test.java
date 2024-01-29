package secondprogram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		college c=a.getBean("stu1", student1.class);
		c.info();
		college c1=a.getBean("stu2", stuident2.class);
		c1.info();
	}

}
