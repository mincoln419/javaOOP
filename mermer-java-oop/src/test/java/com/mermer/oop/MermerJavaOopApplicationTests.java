package com.mermer.oop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

class MermerJavaOopApplicationTests {

    @Test
    void contextLoads() throws IOException {
        String[] args = {"3", "1", "2"};

        Main.main(args);
    }

}
