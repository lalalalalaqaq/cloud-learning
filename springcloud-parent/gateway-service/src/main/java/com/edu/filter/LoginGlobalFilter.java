package com.edu.filter;


import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 全局过滤器 : GlobalFilter
 * 局部 : Ordered
 */
@Component
public class LoginGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("全局过滤器");
        System.out.println("全局拦截器");
        //  request获取
        ServerHttpRequest request = exchange.getRequest();
        // response获取
        ServerHttpResponse response = exchange.getResponse();
        // 获取请求参数
        String token = request.getQueryParams().getFirst("token");
        // 判断token是否为null,如果用户请求参数中没有token，则表示用户未登录
        if (StringUtils.isEmpty(token)){
            // 没有登录，状态设置401
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            // 结束请求
            return response.setComplete();
        }
        // 如果用户传递了一个token，则表示用户已经登录 ,直接放行
        return chain.filter(exchange);
    }

    /**
     * 返回值越小越先执行
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}