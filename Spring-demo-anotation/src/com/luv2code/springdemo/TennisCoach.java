package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/*1. @Component Annotation
The @Component annotation marks a java class as a bean so the component-scanning mechanism-
of spring can pick it up and pull it into the application context. To use this annotation, apply it over class as below:*/

/*---------------------------------------------------------------------------------------------------------------------
In this quick article, we will discuss how to use @Component annotation in Spring-based applications.
The @Component annotation indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.
In short, @Component is a class level annotation. During the component scan, Spring Framework automatically detects classes annotated with @Component.
*/
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
