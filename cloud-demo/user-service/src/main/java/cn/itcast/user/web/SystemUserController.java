package cn.itcast.user.web;

import cn.itcast.user.common.BaseModel;
import cn.itcast.user.config.RemoteConfiguration;
import cn.itcast.user.service.SystemUserService;
import cn.wzd.common.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangxuyang
 * @date 2022/8/23 17:36
 */

@Slf4j
@RestController
@RequestMapping("/user")
public class SystemUserController {

    @Autowired
    private SystemUserService systemUserService;

    @Autowired
    private RemoteConfiguration remoteConfiguration;

    /**
     * @param id:用户识别唯一字段
     * @return: cn.itcast.user.pojo.SystemUser
     * @author zhangxuyang
     * @date 2022/8/23 17:27
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return systemUserService.queryById(id);
    }



    /**

     * @return: cn.itcast.user.common.BaseModel
     * @author zhangxuyang
     * @date 2022/8/23 17:27
     */
   @GetMapping("/get")
    public BaseModel getRemoteConfig() {
        return remoteConfiguration;
    }
}
