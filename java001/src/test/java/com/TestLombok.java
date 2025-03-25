package com;

import com.entity.Phone;
import com.entity.User;
import org.junit.Test;

public class TestLombok {


    @Test
    public void testSome(){
        User user = User.builder()
                .name("张三")
                .phone(new Phone("华为"))
                .addAddress("开封")
                .addAddress("上海")
                .addAddress("许昌")
                .build();
        System.out.println(user);
        user.log();
    }
}
