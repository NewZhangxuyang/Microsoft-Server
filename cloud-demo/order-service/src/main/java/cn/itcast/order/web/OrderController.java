package cn.itcast.order.web;

import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private  Date date;

    @GetMapping("/{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId,
                                    @RequestHeader(value = "CustomRequestHeader",required = false) String requestHeader) {
        System.out.println(new Date()+"--------------------->"+requestHeader);
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }
}
