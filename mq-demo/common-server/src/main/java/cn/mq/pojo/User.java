package cn.mq.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User
 * @BelongsProject: mq-demo
 * @BelongsPackage: cn.itcast.mq.pojo
 * @Author: 张旭阳
 * @CreateTime: 2022-09-07  15:56
 * @Description: TODO
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1932352644907020452L;

    private Integer age;

    private String name;

    private String address;

    private Long phone;

    public User(Integer age, String name, String address, Long phone) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public User(){
    }

}

