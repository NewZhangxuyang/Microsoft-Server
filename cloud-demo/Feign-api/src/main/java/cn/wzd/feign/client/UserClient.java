package cn.wzd.feign.client;


import cn.wzd.feign.config.FeignConfiguration;
import cn.wzd.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : zhangxuyang
 * @date :  2022/8/24
 * @Description :
 */
@FeignClient(value = "user",configuration = FeignConfiguration.class)
public interface UserClient {

    /**
     * @param id: 所要查找的用户id
     * @return: cn.itcast.order.pojo.User
     * @author zhangxuyang
     * @date 2022/8/24 9:32
     */
    @GetMapping("user/{id}")
    User findById(@PathVariable("id") long id );


}
