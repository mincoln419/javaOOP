package com.mermer;

import com.mermer.config.Config;
import com.mermer.config.MyProperties;
import com.mermer.oop.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

import javax.annotation.PostConstruct;

@ConfigurationPropertiesScan
@SpringBootApplication(
		excludeName = "org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration",
		scanBasePackages = {"com.mermer"}

)
public class SpringPracticeApplication {

	final private Integer height;
	final private Environment env;
	final private ApplicationContext context;
	final private MyProperties myProperties;

	final private StudentService studentService;


	public SpringPracticeApplication(
			@Value("${mermer.height}") Integer height,
			Environment env,
			ApplicationContext context,
			Config properties,
			StudentService studentService
	){
		this.height = height;
		this.env = env;
		this.context = context;
		this.myProperties = properties.myProperties();
		this.studentService = studentService;
	}

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringPracticeApplication.class);
		//application.setApplicationStartup(new FlightRecorderApplicationStartup());
		//application.setApplicationStartup(new BufferingApplicationStartup(1000));
		//application.setBannerMode(Banner.Mode.OFF);

		application.run(args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void init(){
		System.out.println("[@Value] " + height);

		System.out.println("[Environment] " + env.getProperty("mermer.height"));
		System.out.println("[ApplicationContext] " + context.getEnvironment().getProperty("mermer.height"));

		System.out.println("[MyProperties] " + myProperties.getHeight());

		studentService.printStudentName("jack");
		studentService.printStudentName("jack");
		studentService.printStudentName("jack");
	}




}
