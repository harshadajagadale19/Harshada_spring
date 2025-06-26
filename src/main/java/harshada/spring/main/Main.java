package harshada.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import harshada_spring.entity.Emp;
import harshada_spring.entity.Nation;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
	Emp emp1=context.getBean("emp",Emp.class);
	System.out.println(emp1);
	/*Emp emp2=context.getBean("emp",Emp.class);
	System.out.println(emp2);*/
	Nation nation=context.getBean("nation",Nation.class);
	System.out.println(nation);
	System.out.println("git succeed");
}
}
