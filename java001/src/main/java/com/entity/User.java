package com.entity;


import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Builder
@Slf4j
public class User {
    private String name;
    private Phone phone;
    @Singular("addAddress")
    private List<String> address;
    public void log(){
        log.info("测试");
    }
//    public static void main(String[] args) {
//        User user = User.builder()
//                .name("张三")
//                .phone(new Phone("华为"))
//                .addAddress("开封")
//                .addAddress("上海")
//                .addAddress("许昌")
//                .build();
//        System.out.println(user);
//    }
}
