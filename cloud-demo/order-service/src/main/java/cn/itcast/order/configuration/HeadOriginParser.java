package cn.itcast.order.configuration;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: HeadOriginParser
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.configuration
 * @Author: 张旭阳
 * @CreateTime: 2022-10-21  16:23
 */
@Component
public class HeadOriginParser implements RequestOriginParser {
    /**
     * <p>@description:返回自定义的来源</p>
     * @param httpServletRequest:
     * @return: java.lang.String
     */
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        String origin = httpServletRequest.getHeader("origin");
        if(!StringUtils.hasText(origin)){
            origin = "blank";
        }
        return origin;
    }
}
