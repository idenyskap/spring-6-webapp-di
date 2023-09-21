package springframework.spring6webapp_di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import springframework.spring6webapp_di.controllers.MyController;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;

	@Test
	void testAutowiredOfController() {
		System.out.println(controller.sayHello());
	}


	@Test
	void testGetControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
