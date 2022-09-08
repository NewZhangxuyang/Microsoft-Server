package cn.itcast.mq.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author : zhangxuyang
 * @date :  2022/9/2
 * @Description :
 */
@Component
public class RabbitmqListen {

    @RabbitListener(queues = {"Fanout.Queue.One"})
    public void fanoutQueueListen(String message){
        System.out.println("Get Message"+message);
    }


    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(name = "DirectQueueOne"),
                    exchange = @Exchange(name = "DirectExchange",type = ExchangeTypes.DIRECT),
                    key = {"Common","QueueOne"}
            )
    )
    public void directQueueListenOne(String message){
        System.out.println("Get Message  QueueOne "+message);
    }

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(name = "DirectQueueTwo"),
                    exchange = @Exchange(name = "DirectExchange",type = ExchangeTypes.DIRECT),
                    key = {"Common","QueueTwo"}
            )
    )

    public void directQueueListenTwo(String message){
        System.out.println("Get Message QueueTwo "+message);
    }


}
