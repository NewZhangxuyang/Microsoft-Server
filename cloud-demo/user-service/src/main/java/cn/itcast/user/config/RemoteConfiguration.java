package cn.itcast.user.config;

import cn.itcast.user.common.BaseModel;
import cn.itcast.user.common.SingleResult;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author : zhangxuyang
 * @date :  2022/8/23
 */
@Data
@Component
@PropertySource("classpath:/bootstrap.yml")
@ConfigurationProperties(prefix = "remoteconfiguration")
public class RemoteConfiguration extends SingleResult implements BaseModel {
    private String name;
    private String email;
    private int age;
    private String home;
    private String nation;
    private String country;
}
