/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.constants;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝服务窗获取*/
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id
    public static final String APP_ID            = "2015042400049658";

    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIICXQIBAAKBgQDeXWT/iutc44lgqEiBNJYCDP1s2/36rI2FPQYvDkmPxDJBIs6sJ2jodJMqlErJ6naaWaRi0vy5rWTM1ZcTRAc+8OC7AZcL2g4XCTmW3Rt1FrRDeepZtQLYj5ZNjTcTzSC7K7Fbt+nAHelJ3merZ7e37CWtXempIP9qBdTDbrtc3QIDAQABAoGAPqXRbq2U4fa5HaJLyxslqC5AuArC43z54i/vLhK4Zui/v9ouoBH6XIN7cuOUro6AG7xls/H9gdJ4M715ctQXtf1N/VT6/Vs7Bs7J/5mUOfF7hltBlVqveW/UO15zKX8cSlzgAytxe+wfYoJP5hMqN3NyEnbnw5TmcPxaZZcDn4ECQQD6eWfDfj1D3/8txj+y4Mh/up6xggo9sK1V/pnw4AAfagqwpiSVH65ZKlLj29lrTW/YMehKTGSKSufJNvfqhdwzAkEA40U8kvHz/aloBrKWHfmgiAlJEfKBpyu731ZThJ+6sL02kKPWsyQIfAxnpf4sAmaVwNpmAYDy/7eIaNNz3wjSrwJAOVbvrS5KIi62QSlgTbftzmfPin1lkMfQdp5JaX4uKQLinZv7RfQxupHY1fbvaAQbNZf/QHsKjSoms8aUrKimRwJBAL7J+9z8IzD6Syr8Nwt46Ovqp53acD9Pdos55Cj9EnOWlDz+XZnLkRfaLhTqeDWXuvXIIkP25YgIogomISrGNF8CQQCslHACF+vjIHiIpuP3iDhsd7M6USjM1qMvXJuH1KHOIlkhrvHgkTAk0jPL4TSISQ/N+9MW5nmz8HrS6WVi7sKd";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDeXWT/iutc44lgqEiBNJYCDP1s2/36rI2FPQYvDkmPxDJBIs6sJ2jodJMqlErJ6naaWaRi0vy5rWTM1ZcTRAc+8OC7AZcL2g4XCTmW3Rt1FrRDeepZtQLYj5ZNjTcTzSC7K7Fbt+nAHelJ3merZ7e37CWtXempIP9qBdTDbrtc3QIDAQAB";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
