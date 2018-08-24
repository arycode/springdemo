package com.ary.controller;

import com.ary.bean.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@EnableAutoConfiguration
@RestController
@Api("Swagger测试")
public class UserInfoController {


    @RequestMapping(value = "/getUser",produces="application/json;charset=UTF-8")
    @ApiOperation(value = "返回用户信息",notes = "展示json数据")
    @ApiImplicitParam(name="",value = "all mes")
    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setName("张三");
        userInfo.setAddress("zhangsan");
        userInfo.setBirthDate(new Date());
        return userInfo;
    }

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/getStuent",method = RequestMethod.GET)
    public UserInfo getStudent(@PathVariable int id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName("张三");
        userInfo.setBirthDate(new Date());
        return userInfo;
    }

}
