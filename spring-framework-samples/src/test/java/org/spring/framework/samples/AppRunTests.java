package org.spring.framework.samples;

import java.util.Arrays;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.samples.ApplicationConfiguration;

public class AppRunTests {


	@Test
	public void annotationConfigApplicationContextTest() {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

//		ac.close();
		String[] aliases = ac.getAliases("beanInitLifeCycle1");
		Arrays.stream(aliases).forEach(System.out::println);
	}

}
