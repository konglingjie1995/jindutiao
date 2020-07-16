package com.qf.springbootstudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudyApplicationTests {

    @Test
    public void contextLoads() {
        //初始化程序用的 统一资源
    }

    @Test
    public void testLogin(){

        System.out.println("测试登录功能.......");
    }

}
