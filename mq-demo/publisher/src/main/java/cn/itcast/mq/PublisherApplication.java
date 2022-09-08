package cn.itcast.mq;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author zhangxuyang
 * @date 2022/9/7 15:49
 * @description:
 */
@SpringBootApplication
public class PublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class);
    }

    @Bean
    public MessageConverter customMessageConverter(){
         return new Jackson2JsonMessageConverter();
    }
}
