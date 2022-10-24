package cn.itcast.user.service;

import cn.wzd.common.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: SystemUserService
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.user.service
 * @Author: 张旭阳
 * @CreateTime: 2022-10-09  10:52
 */
public interface SystemUserService {
   /**
    * <p>@description:</p>
    * @param id:
    * @return: cn.itcast.user.pojo.SystemUser
    */
    public User queryById(Long id);
}
