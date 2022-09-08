package cn.itcast.order.service;


/**
 * @author zhangxuyang
 * @date 2022/8/24 9:36
 */
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.wzd.feign.client.UserClient;
import cn.wzd.feign.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;
    /**
     * @param orderId: 订单的编号
     * @return: cn.itcast.order.pojo.Order
     * @author zhangxuyang
     * @date 2022/8/24 13:06
     */

    public Order queryOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);
        User user  = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }



}
