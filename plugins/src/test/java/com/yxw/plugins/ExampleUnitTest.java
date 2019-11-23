package com.yxw.plugins;


import org.junit.Test;

public class ExampleUnitTest {

    @Test
    public void userTest(){
        User user = new User();
        user.setAge(12);
        user.setAccount("abc");
        user.setPwd("123465");
        user.setEmail("123@qq.com");
        System.out.println(user.toString());
    }

}