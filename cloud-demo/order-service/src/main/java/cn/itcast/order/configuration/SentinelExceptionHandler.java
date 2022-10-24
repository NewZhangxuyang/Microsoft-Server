package cn.itcast.order.configuration;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: SentinelExceptionHandler
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.configuration
 * @Author: 张旭阳
 * @CreateTime: 2022-10-24  10:18
 */
public class SentinelExceptionHandler  implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {

    }
}
