package cn.itcast.user.service.Imp;

import cn.itcast.user.mapper.UserMapper;
import cn.wzd.common.pojo.User;
import cn.itcast.user.service.SystemUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author zhangxuyang
 * @date 2022/8/23 17:31
 */
@Slf4j
@Service
@DubboService
public class SystemUserServiceImp  implements SystemUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}