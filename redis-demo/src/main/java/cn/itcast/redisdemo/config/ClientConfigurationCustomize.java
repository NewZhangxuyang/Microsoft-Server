package cn.itcast.redisdemo.config;

import io.lettuce.core.ReadFrom;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: ClientConfigurationCustomize
 * @BelongsProject: redis-demo
 * @BelongsPackage: cn.itcast.redisdemo.config
 * @Author: 张旭阳
 * @CreateTime: 2022-10-27  17:57
 */
@Configuration
public class ClientConfigurationCustomize  {
   /**
    * <p>@description:利用 lambada 表达式来构造自定义LettuceClientConfigurationBuilderCustomizer</p>
    * @return: org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer
    */
    @Bean
    public LettuceClientConfigurationBuilderCustomizer clientConfigurationBuilderCustomizer(){
        return  clientConfigurationBuilder -> clientConfigurationBuilder.readFrom(ReadFrom.REPLICA_PREFERRED);
    }
}
