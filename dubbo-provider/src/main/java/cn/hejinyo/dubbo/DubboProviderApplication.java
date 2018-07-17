package cn.hejinyo.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderApplication {
    /**
     * 使用jar方式打包的启动方式
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboProviderApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }
}
