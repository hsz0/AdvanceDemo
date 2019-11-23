package com.yxw.plugins;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String account;
    private String pwd;
    private String email;
    private int age;
}
