package cn.itcast.order.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * <p>@Description: 当前</p>
 *
 * @ClassName: Configuration
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.configuration
 * @Author: 张旭阳
 * @CreateTime: 2022-10-20  16:20
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * <p>@description:Sentinel's Global Configuration Include Filter... </p>
     * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
     */
//    @Bean
//    public FilterRegistrationBean sentinelFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new CommonFilter());
//        registration.addUrlPatterns("/*");
//        // 入口资源关闭聚合
//        registration.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
//        registration.setName("sentinelFilter");
//        registration.setOrder(1);
//        return registration;
//    }
}
