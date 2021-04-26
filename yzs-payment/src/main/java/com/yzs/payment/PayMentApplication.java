package com.yzs.payment;

import cn.hutool.core.date.SystemClock;
import cn.hutool.core.text.StrFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.yzs")
@EnableEurekaClient
public class PayMentApplication {
    public static void main(String[] args) {
        long start = SystemClock.now();
        ConfigurableApplicationContext context = SpringApplication.run(PayMentApplication.class);
        Environment environment = context.getBean(Environment.class);
        System.out.println(StrFormatter.format(">>>>>{}启动成功。耗时：{}秒。端口：{}<<<<<", context.getId(), (SystemClock.now() - start) / 1000, environment.getProperty("local.server.port")));
    }
}
