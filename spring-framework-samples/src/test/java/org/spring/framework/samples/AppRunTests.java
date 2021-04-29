package org.spring.framework.samples;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.ApplicationConfiguration;

public class AppRunTests {

	@Test
	public void annotationConfigApplicationContextTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		ac.close();

	}

}
