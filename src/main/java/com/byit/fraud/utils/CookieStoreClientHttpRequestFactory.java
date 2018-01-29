package com.byit.fraud.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.protocol.HttpContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import java.net.URI;

/**
 * Created by shawn on 2018/01/29.
 */
public class CookieStoreClientHttpRequestFactory extends HttpComponentsClientHttpRequestFactory {
    public static int connectTimeout = 1000; // 连接超时
    public static int readTimeout = 5000; // 数据读取超时时间，即SocketTimeout
    public static int connectionRequestTimeout = 200; // 连接不够用的等待时间，不宜过长，必须设置，比如连接不够用时，时间过长将是灾难性的

    private final HttpContext httpContext;

    public CookieStoreClientHttpRequestFactory(HttpClient httpClient, HttpContext httpContext, int connectTimeout, int readTimeout) {
        super(httpClient);
        this.setConnectTimeout(connectTimeout);
        this.setReadTimeout(readTimeout);
        this.setConnectionRequestTimeout(connectionRequestTimeout);
        this.httpContext = httpContext;
    }

    public CookieStoreClientHttpRequestFactory(HttpClient httpClient, HttpContext httpContext) {
        super(httpClient);
        this.setConnectTimeout(connectTimeout);
        this.setReadTimeout(readTimeout);
        this.setConnectionRequestTimeout(connectionRequestTimeout);
        //缓冲请求数据，默认值是true。通过POST或者PUT大量发送数据时，建议将此属性更改为false，以免耗尽内存。
        //this.setBufferRequestBody(false);
        this.httpContext = httpContext;
    }

    @Override
    protected HttpContext createHttpContext(HttpMethod httpMethod, URI uri) {
        return this.httpContext;
    }
}