package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.SystemUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author zhangxuyang
 * @date 2022/8/23 17:31
 */
@Slf4j
@Service
public class SystemUserService {

    @Autowired
    private UserMapper userMapper;

    public SystemUser queryById(Long id) {
        return userMapper.findById(id);
    }
}