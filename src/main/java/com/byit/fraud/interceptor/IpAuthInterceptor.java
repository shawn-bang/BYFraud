package com.byit.fraud.interceptor;

import com.byit.fraud.config.IPWhiteConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;

/**
 * Created by shawn on 2018/01/24.
 */
public class IpAuthInterceptor extends HandlerInterceptorAdapter {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private Pattern allowPattern;
    private Pattern denyPattern;

    private void loadIps(){
        String allows = IPWhiteConfig.get().ipAllows;
        String denys = IPWhiteConfig.get().ipDenys;
        if(StringUtils.isNotBlank(allows)){
            allowPattern = Pattern.compile(allows);
        }
        if(StringUtils.isNotBlank(denys)){
            denyPattern = Pattern.compile(denys);
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        loadIps();
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            final String remoteAddr = request.getRemoteAddr();
            logger.info("ip auth remote address:{}",remoteAddr);
            //如果明确禁止访问或者不在允许访问列表内，则访问受限
            if((denyPattern!=null && denyPattern.matcher(remoteAddr).matches()) || (allowPattern != null  && !allowPattern.matcher(remoteAddr).matches())){
                if (handlerMethod.getMethodAnnotation(ResponseBody.class) != null) {
                    logger.warn("ip access reject,remote address:{}", remoteAddr);
                    // TODO response the remind message info
                    return false;
                }
                return false;
            }
        }
        return true;
    }
}
