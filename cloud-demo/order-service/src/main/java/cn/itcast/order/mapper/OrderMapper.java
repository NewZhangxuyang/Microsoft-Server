package cn.itcast.order.mapper;

import cn.wzd.common.pojo.Order;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhangxuyang
 * @date 2022/8/24 9:43
 */
public interface OrderMapper {
    /**
     * @param id: 订单的ID
     * @return: cn.itcast.order.pojo.cn.wzd.common.pojo.Order
     * @author zhangxuyang
     * @date 2022/8/24 13:07
     */
    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
