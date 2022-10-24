package cn.wzd.gateway.CustomedFilter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author : zhangxuyang
 * @date :  2022/9/1
 * @Description :
 */
@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {

    private static final String authorizedUser = "admin";

    /**
     * @Description<><p> configure the filter confirm request's params Key-Value <p/></>
     * @param exchange:
     * @param chain:
     * @return: reactor.core.publisher.Mono<java.lang.Void>
     * @author zhangxuyang
     * @date 2022/9/1 13:40
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest  request = exchange.getRequest().mutate().header("origin","gateWay").build();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        String  authorized = queryParams.getFirst("Authorization");
        if (authorizedUser.equals(authorized)){
            return chain.filter(exchange);
        }
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        return  exchange.getResponse().setComplete();
    }
    @Override
    public int getOrder() {
        return -1;
    }
}
