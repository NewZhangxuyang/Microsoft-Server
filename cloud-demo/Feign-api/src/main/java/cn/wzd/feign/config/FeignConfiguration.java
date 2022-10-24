package cn.wzd.feign.config;

import cn.wzd.feign.client.sentinelfallback.UserClientFallBack;
import feign.Logger;
import org.springframework.context.annotation.Bean;


/**
 * @author : zhangxuyang
 * @date :  2022/8/24
 * @Description :
 */
public class FeignConfiguration {

    /**
     * @return: feign.Logger.Level
     * @author zhangxuyang
     * @date 2022/8/24 13:07
     */
    @Bean
    public Logger.Level setFeignLogLevel(){
        return Logger.Level.FULL;
    }


    @Bean
    public UserClientFallBack userClientFallBack(){
        return  new UserClientFallBack();
    }

}
