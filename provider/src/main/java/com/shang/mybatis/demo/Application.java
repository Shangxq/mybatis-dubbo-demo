package com.shang.mybatis.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableScheduling
@SpringBootApplication
@MapperScan("com.shang.mybatis.demo.mapper")
@EnableDubboConfiguration
public class Application {

    public static void main(final String[] args) throws UnknownHostException {


        final ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class)
                .web(true)
                .run(args);

        final Environment env = context.getEnvironment();

        Application.log.info("\n----------------------------------------------------------\n\t" +
                "Application '{}' is running! ActiveProfiles is '{}', Access URLs:\n\t" +
                "Local: \t\thttp://127.0.0.1:{}\n\t" +
                "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("spring.profiles.active"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }
}
