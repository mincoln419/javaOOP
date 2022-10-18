package com.mermer.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SpringBootApplication
public class MermerJavaOopApplication {


        //SpringApplication.run(MermerJavaOopApplication.class, args);
        static int anwer = 0;
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bf.readLine());
            String arrs = bf.readLine();
            StringTokenizer st = new StringTokenizer(arrs, " ");
            int[] answer = new int[n];
            int idx = 0;
            while(st.hasMoreTokens()){
                answer[idx] = Integer.parseInt(st.nextToken());
                idx++;
            }
            sort(answer);
        }


        public static void sort(int[] raw){
            boolean flag = true;
            for(int i = 0 ; i < raw.length; i++){
                flag = true;
                for(int j = 0 ; j < raw.length-1; j++){
                    int x = raw[j];
                    int y = raw[j + 1];
                    if(x > y){
                        flag = false;
                        raw[j] = y;
                        raw[j + 1] = x;
                    }
                }
                if(flag){
                    System.out.println(i);
                    break;
                }
            }
            if(!flag)System.out.println(raw.length);
        }

}
