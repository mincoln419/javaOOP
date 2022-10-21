package com.mermer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringPracticeApplication.class);
		//application.setApplicationStartup(new FlightRecorderApplicationStartup());
		//application.setApplicationStartup(new BufferingApplicationStartup(1000));
		//application.setBannerMode(Banner.Mode.OFF);

		application.run(args);


	}

}
