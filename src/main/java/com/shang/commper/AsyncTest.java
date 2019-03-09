package com.shang.commper;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: sjy
 * @create: 2019-03-04 19:09
 * @Description: java类作用描述
 * @Version: 1.0
 **/
@Component
public class AsyncTest {

    @Async
    public void asyncOut(){
        System.out.println("异步方法ID:"+Thread.currentThread().getId());
    }
}
