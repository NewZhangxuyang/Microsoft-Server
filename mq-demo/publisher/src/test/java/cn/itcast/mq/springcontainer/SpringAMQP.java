package cn.itcast.mq.springcontainer;

import cn.itcast.mq.PublisherApplication;
import cn.mq.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

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
    public  void  sendMessageCommon (){
      String  message = "Common";
      String  exchangeName = "DirectExchange";
      rabbitTemplate.convertAndSend(exchangeName,"Common",message);
  }

  @Test
    public  void  sendMessagePrivate (){
    Map<String, Object> messageMap = new HashMap<>();
    User user = new User(23,"张旭阳","安徽省",15556738945L);
    messageMap.put("Belong","QueueTwo");
    messageMap.put("Date",user);
    String  exchangeName = "DirectExchange";
    rabbitTemplate.convertAndSend(exchangeName,"QueueTwo",messageMap);
    }




}
