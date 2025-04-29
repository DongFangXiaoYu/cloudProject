package com.ruoyi.system.controller;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description
 * @AUTHER: sk
 * @DATE: 2025/4/23
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-test.yml")
@Slf4j
public class SysUserOnlineControllerTest  {

    @Resource
    private ISysUserService userService;

    @Test
    public void list() {
        System.out.println("test start--------------");
        String name = "admin";
        SysUser userInfo = userService.selectUserByUserName(name);
        System.out.println(JSON.toJSONString("userInfo:" + userInfo));
        log.info("test end--------------");
    }

    @Test
    public void forceLogout() {
    }
}
