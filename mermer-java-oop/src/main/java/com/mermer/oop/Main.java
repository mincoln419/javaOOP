package com.mermer.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


        public static void main(String[] args) throws IOException {
            Sort bubbleSort = new BubbleSort();

            System.out.println("[result]" + bubbleSort.sort(Arrays.asList(args)));
        }

}
