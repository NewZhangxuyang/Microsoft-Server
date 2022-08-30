package cn.itcast.user.mapper;

import cn.itcast.user.pojo.SystemUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * @author zhangxuyang
 * @date 2022/8/23 17:32
 */
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    SystemUser findById(@Param("id") Long id);
}