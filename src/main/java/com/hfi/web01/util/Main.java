package com.hfi.web01.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.lang.reflect.Field;

/**
 * @ClassName CodeGennerate
 * @Auther VCC
 * @Date 2019/3/9 13:59
 * @Description
 * @Version
 */
public class Main {
    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        int count = 1000;
        int sum=0;
        for (int i = 0; i<40;i++){
            sum=count*4;
            count=count+100;
        }
        System.out.println(sum);

    }


}
