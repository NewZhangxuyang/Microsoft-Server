package cn.itcast.user.pojo;

import cn.itcast.user.common.BaseModel;
import cn.itcast.user.common.SingleResult;
import lombok.Data;
/**
 * @author zhangxuyang
 * @date 2022/8/23 17:32
 */
@Data
public class SystemUser extends SingleResult implements BaseModel {
    private Long id;
    private String username;
    private String address;
}