package cn.itcast.order.service;


/**
 * @author zhangxuyang
 * @date 2022/8/24 9:36
 */
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.user.service.SystemUserService;
import cn.wzd.common.pojo.Order;
import cn.wzd.common.pojo.User;
import cn.wzd.feign.client.UserClient;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    @DubboReference
    private SystemUserService systemUserService;


    /**
     * <p>@description:feign's RPC </p>
     * @param orderId:
     * @return: cn.wzd.common.pojo.Order
     */
    public Order queryOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);
        User user  = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }


    /**
     * <p>@description:Dubbo's RPC and the protocol is dubbo </p>
     * @param orderId:
     * @return: cn.wzd.common.pojo.Order
     */
    public Order selectOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);
        User user  = systemUserService.queryById(order.getUserId());
        order.setUser(user);
        return order;
    }


    @SentinelResource(value = "selectGoods")
    public String selectGoods() {
        return "SUCCEED SELECT GOODS DETAIL";
    }




}
