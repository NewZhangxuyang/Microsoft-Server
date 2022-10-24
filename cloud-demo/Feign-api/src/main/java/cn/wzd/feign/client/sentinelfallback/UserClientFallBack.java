package cn.wzd.feign.client.sentinelfallback;

import cn.wzd.common.pojo.User;
import cn.wzd.feign.client.UserClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>@Description:</> Use Sentinel's Feign, FallbackFactory<T> base on feign-hystrix  ,not openFeign's FallbackFactory<T></></p>
 *
 * @ClassName: UserClientFallBack
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.wzd.feign.client.sentinelfallback
 * @Author: 张旭阳
 * @CreateTime: 2022-10-21  13:41
 */
@Slf4j
public class UserClientFallBack  implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public User findById(long id) {
                log.error("Fail",cause);
                User  failUser = new User();
                failUser.setUsername("This is failed ,please try moment");
                return failUser;
            }
        };
    }

}
