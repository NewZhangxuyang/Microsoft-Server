package cn.itcast.mq.springcontainer;

import cn.itcast.mq.PublisherApplication;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : zhangxuyang
 * @date :  2022/9/2
 * @Description :
 */
@SpringBootTest(classes = {PublisherApplication.class})
public class SpringAMQP {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Test
    public  void  testRabbitTemplate (){
      String queueName = "simple.queue";
      String  message = "发送消息";
      rabbitTemplate.convertAndSend(queueName,message);
  }

}
