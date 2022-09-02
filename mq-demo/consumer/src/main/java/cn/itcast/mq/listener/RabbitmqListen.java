package cn.itcast.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author : zhangxuyang
 * @date :  2022/9/2
 * @Description :
 */
@Component
public class RabbitmqListen {

    @RabbitListener(queues = {"simple.queue"})
    public void queueListen(String message){
        System.out.println("Get Message"+message);
    }

}
