/**
 * 
 */
package com.alipay.constants;

import org.apache.commons.lang.StringUtils;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午3:18:28
 *
 */
public class MenuUrlConfig {

    public static String PREFIX = "loooz_";
    
    public static String BASE_URL = "http://110.249.163.146:8083/hospital/";
    
    private enum Config {
        
        REGISTER("register", "Registration.html"),
        COMING("coming", "coming.html");
        
        private String key;
        
        private String url;

        private Config(String key, String url) {
            this.key = key;
            this.url = url;
        }
    }
    
    public static String getUrlByMenuId(String key) {
        for (Config config : Config.values()) {
            if (StringUtils.equals(config.key, key)) {
                return BASE_URL + config.url;
            }
        }
        return BASE_URL;
    }
    
    public static String getUrlByMenuId(String key, String userId) {
        for (Config config : Config.values()) {
            if (StringUtils.equals(PREFIX + config.key, key)) {
                return BASE_URL + config.url + "?userId=" + userId;
            }
        }
        return BASE_URL;
    }
}
