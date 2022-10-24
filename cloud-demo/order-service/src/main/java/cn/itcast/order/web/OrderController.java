package cn.itcast.order.web;

import cn.itcast.order.service.OrderService;
import cn.wzd.common.pojo.Order;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private  Date date;

    @SentinelResource(value = "Feign's RPC  Invoke")
    @GetMapping("/query/{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId,
                                    @RequestHeader(value = "CustomRequestHeader",required = false) String requestHeader,
                                    HttpServletRequest request) {

        System.err.print(new Date() + "=================================================="+request.getHeader("origin"));
        System.out.println(new Date()+"------------------------------------------------->"+requestHeader);
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }


    @SentinelResource(value = "Dubbo's RPC Invoke")
    @GetMapping("/select/{orderId}")
    public Order selectOrderByUserId(@PathVariable("orderId") Long orderId,
                                    @RequestHeader(value = "CustomRequestHeader",required = false) String requestHeader) {
        System.out.println(new Date()+"--------------------->"+requestHeader);
        return orderService.selectOrderById(orderId);
    }


    @GetMapping("/query")
    public String query() {
          orderService.selectGoods();
          return "QUERY SUCCEED";

    }

    @GetMapping("/update")
    public String update(){
        orderService.selectGoods();
        return "UPDATE  SUCCEED";
    }

}
