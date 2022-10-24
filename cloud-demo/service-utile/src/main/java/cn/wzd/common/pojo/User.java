package cn.wzd.common.pojo;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: cn.wzd.common.pojo.User
 * @BelongsProject: cloud-demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: 张旭阳
 * @CreateTime: 2022-10-09  14:38
 */
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String address;
}
