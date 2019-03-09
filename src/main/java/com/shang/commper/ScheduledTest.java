package com.shang.commper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: sjy
 * @create: 2019-03-04 18:46
 * @Description: java类作用描述
 * @Version: 1.0
 **/
@Component
public class ScheduledTest {
    @Autowired
    private AsyncTest asyncTest;

    @Value("${name}")
    private String name;

    @Scheduled(fixedRate = 100000)
    public void showtime(){
        asyncTest.asyncOut();
        System.out.println("1.当前时间戳为"+System.currentTimeMillis());
    }

    @Scheduled(cron="*/10 * * * * ?")
    private void process(){
        System.out.println("读取配置文件中的值为："+name);
        System.out.println("2.当前时间戳为"+System.currentTimeMillis());
    }
}
