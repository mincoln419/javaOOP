package com.mermer.oop;

public class BubbleSort {

    public int[] sort(int[] raw){

        boolean flag = true;
        for(int i = 0 ; i < raw.length; i++){
            flag = true;
            for(int j = 0 ; j < raw.length-1; j++){
                if(raw[j] > raw[j + 1]){
                    flag = false;
                    int tmp = raw[j];
                    raw[j] = raw[j + 1];
                    raw[j + 1] = tmp;
                }
            }
            if(flag){
                System.out.println("i:" + i);
                break;
            }
        }
        if(!flag)System.out.println("i:" + raw.length);
        return raw;
    }
}
