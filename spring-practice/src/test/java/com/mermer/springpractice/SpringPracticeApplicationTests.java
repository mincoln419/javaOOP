package com.mermer.springpractice;

import com.mermer.oop.Main;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Arrays;

class SpringPracticeApplicationTests {

	@Test
	void contextLoads() throws IOException {
		String[] args = {"3", "2" , "1"};
		Main.main(args);
	}

}
