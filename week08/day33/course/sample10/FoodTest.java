package week08.day33.course.sample10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("sample10_1.xml");
		System.out.println("************ IoC 컨테이너의 초기화 작업 끝 ************\n");

		MyFoodMgr ob=factory.getBean("myFood", MyFoodMgr.class);
		System.out.println(ob.toString());

		((ClassPathXmlApplicationContext) factory).close();
	}
}
