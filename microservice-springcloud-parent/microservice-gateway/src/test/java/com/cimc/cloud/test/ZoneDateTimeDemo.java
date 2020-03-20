package com.cimc.cloud.test;

import java.time.ZonedDateTime;

/**
 * @author chenz
 * @create 2020-03-19 16:47
 */
public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();  //默认时区
        System.out.println(zbj);
    }
}
