package cn.wzd.feign.client;


import cn.wzd.common.pojo.User;
import cn.wzd.feign.client.sentinelfallback.UserClientFallBack;
import cn.wzd.feign.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : zhangxuyang
 * @date :  2022/8/24
 * @Description  Feign's Client  and @FeignClient's must set the fallbackFactory properties :
 */

@FeignClient(value = "user",configuration = FeignConfiguration.class,fallbackFactory = UserClientFallBack.class)
public interface UserClient {
    /**
     * @param id: 所要查找的用户id
     * @return: cn.itcast.order.pojo.cn.wzd.common.pojo.User
     * @author zhangxuyang
     * @date 2022/8/24 9:32
     */

    @GetMapping("user/{id}")
    User findById(@PathVariable("id") long id );



}
