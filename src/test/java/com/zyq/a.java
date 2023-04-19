package com.zyq;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author WangDZz
 * @Description：
 * @date 2022/9/22 - 17:19
 */
public class a {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
    }
}
