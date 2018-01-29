package com.byit.fraud.config;

import com.byit.fraud.utils.JsonUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

/**
 * Created by shawn on 2018/01/24.
 */
public class IPWhiteConfig {
    public String ipAllows;
    public String ipDenys;

    private static final Logger logger = LoggerFactory.getLogger(IPWhiteConfig.class);

    private volatile static IPWhiteConfig configInstance;

    static {
        try {
            _loadConfig();
        } catch (Throwable e) {
            logger.error("ipWhites load config error", e);
        }
    }

    public static IPWhiteConfig get() {
        return configInstance;
    }

    private static void _loadConfig() throws Exception{
        String config = null;
        logger.warn("load config data from class path");
        URL url = IPWhiteConfig.class.getResource("/ipWhites.json");
        if (url != null) {
            config = new String(IOUtils.toByteArray(url.openStream()), "UTF-8");
            logger.info("init load ipwhites from class path config:{}", config);
        }
        parseConfig(config);
    }

    private static void parseConfig(String config) throws Exception {
        if (StringUtils.isEmpty(config)) {
            logger.error("empty config json string");
            return;
        }
        configInstance = JsonUtil.getInstance().readJson(config, IPWhiteConfig.class);
    }
}
