package cn.itcast.mq.FanoutConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : zhangxuyang
 * @date :  2022/9/7
 * @Description :
 */
@Configuration
public class FanoutConfiguration {
    @Bean
    public FanoutExchange fanoutExchange(){
        return  new FanoutExchange("Main.Fanout");
    }
    @Bean(name = "QueueOne")
    public Queue getFanoutQueueOne(){
        return new Queue("Fanout.Queue.One");
    }

    /**
     * @param fanoutExchange:交换机
     * @param queue: 消息队列，根据BeanName注入
     * @return: org.springframework.amqp.core.Binding
     * @author zhangxuyang
     * @date 2022/9/7 14:22
     * @description:
     */
    @Bean
    public Binding fanoutQueueBindOne(FanoutExchange fanoutExchange,
                                      @Qualifier("QueueOne") Queue queue){
        return BindingBuilder
                .bind(queue)
                .to(fanoutExchange);
    }

    @Bean(name = "QueueTwo")
    public Queue getFanoutQueueTwo(){
        return new Queue("Fanout.Queue.Two");
    }

    /**
     * @param fanoutExchange: 交换机
     * @param queue: 消息队列，依据BeanName注入
     * @return: org.springframework.amqp.core.Binding
     * @author zhangxuyang
     * @date 2022/9/7 14:23
     * @description:
     */
    @Bean
    public Binding fanoutQueueBindTwo(FanoutExchange fanoutExchange,
                                      @Qualifier("QueueTwo") Queue queue){
        return BindingBuilder
                .bind(queue)
                .to(fanoutExchange);
    }


}
