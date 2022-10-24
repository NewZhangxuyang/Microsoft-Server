package cn.itcast.user;
import cn.itcast.user.service.Imp.SystemUserServiceImp;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxuyang
 * @date 2022/8/23 17:33
 */
@EnableDubbo(scanBasePackages = {"cn.itcast.user.service.**"})
@EnableDiscoveryClient
@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
