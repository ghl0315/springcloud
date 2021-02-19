package cn.how2j.springcloud;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.NumberUtil;

@SpringBootApplication
@EnableEurekaClient //只能被eureka发现
@EnableDiscoveryClient //可以被任何注册中心发现
@EnableFeignClients
public class ProductViewServiceFeignApplication {

    public static void main(String[] args) {
        int port = 0;
        int defaultPort = 8012;
        new SpringApplicationBuilder(ProductViewServiceFeignApplication.class).properties("server.port=" + defaultPort).run(args);
    }
}
