package com.mermer.oop;

import com.mermer.oop.config.Config;
import com.mermer.oop.service.SortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


        public static void main(String[] args) throws IOException {
            ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

            SortService sortService = context.getBean(SortService.class);

            System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));

        }

}
