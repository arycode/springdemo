package com.ary.lombok;

import com.ary.bean.UserInfo;
import lombok.extern.java.Log;

import java.util.Date;


@Log
public class LombokTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setName("张三");
        userInfo.setAddress("zhangsan");
        userInfo.setBirthDate(new Date());

        System.out.println(userInfo.toString());



        UserInfo userInfo2 = new UserInfo();
        userInfo2.setId(1);
        userInfo2.setName("张三");
        userInfo2.setAddress("zhangsan");
        userInfo2.setBirthDate(new Date());



        System.out.println(userInfo.equals(userInfo2));



        userInfo2.setId(2);
        System.out.println(userInfo.equals(userInfo2));



        log.info("lombok test");



    }

}
