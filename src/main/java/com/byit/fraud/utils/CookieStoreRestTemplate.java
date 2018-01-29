package com.byit.fraud.utils;

import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by shawn on 2018/01/29.
 */
public class CookieStoreRestTemplate extends RestTemplate {
    private final CookieStore cookieStore;
    private final HttpContext httpContext;
    private final CookieStoreClientHttpRequestFactory cookieStoreClientHttpRequestFactory;

    public CookieStoreRestTemplate(HttpClient httpClient, List<HttpMessageConverter<?>> messageConverters, int connectTimeout, int readTimeout, CookieStore cookieStore) {
        super(messageConverters);
        if (cookieStore == null) {
            this.cookieStore = new BasicCookieStore();
        } else {
            this.cookieStore = cookieStore;
        }
        this.httpContext = new BasicHttpContext();
        this.httpContext.setAttribute(ClientContext.COOKIE_STORE, getCookieStore());
        this.cookieStoreClientHttpRequestFactory = new CookieStoreClientHttpRequestFactory(httpClient, httpContext, connectTimeout, readTimeout);
        super.setRequestFactory(cookieStoreClientHttpRequestFactory);
    }
    public CookieStoreRestTemplate(HttpClient httpClient, List<HttpMessageConverter<?>> messageConverters, int connectTimeout, int readTimeout) {
        super(messageConverters);
        cookieStore = new BasicCookieStore();
        httpContext = new BasicHttpContext();
        httpContext.setAttribute(ClientContext.COOKIE_STORE, getCookieStore());
        cookieStoreClientHttpRequestFactory = new CookieStoreClientHttpRequestFactory(httpClient, httpContext, connectTimeout, readTimeout);
        super.setRequestFactory(cookieStoreClientHttpRequestFactory);
    }

    public CookieStoreRestTemplate(HttpClient httpClient, List<HttpMessageConverter<?>> messageConverters) {
        super(messageConverters);
        cookieStore = new BasicCookieStore();
        httpContext = new BasicHttpContext();
        httpContext.setAttribute(ClientContext.COOKIE_STORE, getCookieStore());
        cookieStoreClientHttpRequestFactory = new CookieStoreClientHttpRequestFactory(httpClient, httpContext);
        super.setRequestFactory(cookieStoreClientHttpRequestFactory);
    }

    public CookieStoreRestTemplate(HttpClient httpClient) {
        super();
        cookieStore = new BasicCookieStore();
        httpContext = new BasicHttpContext();
        httpContext.setAttribute(ClientContext.COOKIE_STORE, getCookieStore());
        cookieStoreClientHttpRequestFactory = new CookieStoreClientHttpRequestFactory(httpClient, httpContext);
        super.setRequestFactory(cookieStoreClientHttpRequestFactory);
    }

    public CookieStore getCookieStore() {
        return cookieStore;
    }

    public HttpContext getHttpContext() {
        return httpContext;
    }

    public CookieStoreClientHttpRequestFactory getCookieStoreClientHttpRequestFactory() {
        return cookieStoreClientHttpRequestFactory;
    }

}