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
    public static final String PRIVATE_KEY       = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAN5dZP+K61zjiWCoSIE0lgIM/Wzb/fqsjYU9Bi8OSY/EMkEizqwnaOh0kyqUSsnqdppZpGLS/LmtZMzVlxNEBz7w4LsBlwvaDhcJOZbdG3UWtEN56lm1AtiPlk2NNxPNILsrsVu36cAd6UneZ6tnt7fsJa1d6akg/2oF1MNuu1zdAgMBAAECgYA+pdFurZTh9rkdokvLGyWoLkC4CsLjfPniL+8uErhm6L+/2i6gEfpcg3ty45SujoAbvGWz8f2B0ngzvXly1Be1/U39VPr9WzsGzsn/mZQ58XuGW0GVWq95b9Q7XnMpfxxKXOADK3F77B9igk/mEyo3c3ISdufDlOZw/FpllwOfgQJBAPp5Z8N+PUPf/y3GP7LgyH+6nrGCCj2wrVX+mfDgAB9qCrCmJJUfrlkqUuPb2WtNb9gx6EpMZIpK58k29+qF3DMCQQDjRTyS8fP9qWgGspYd+aCICUkR8oGnK7vfVlOEn7qwvTaQo9azJAh8DGel/iwCZpXA2mYBgPL/t4ho03PfCNKvAkA5Vu+tLkoiLrZBKWBNt+3OZ8+KfWWQx9B2nklpfi4pAuKdm/tF9DG6kdjV9u9oBBs1l/9AewqNKiazxpSsqKZHAkEAvsn73PwjMPpLKvw3C3jo6+qnndpwP092iznkKP0Sc5aUPP5dmcuRF9ouFOp4NZe69cgiQ/bliAiiCiYhKsY0XwJBAKyUcAIX6+MgeIim4/eIOGx3szpRKMzWoy9cm4fUoc4iWSGu8eCRMCTSM8vhNIhJD8370xbmebPwetLpZWLuwp0=";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDeXWT/iutc44lgqEiBNJYCDP1s2/36rI2FPQYvDkmPxDJBIs6sJ2jodJMqlErJ6naaWaRi0vy5rWTM1ZcTRAc+8OC7AZcL2g4XCTmW3Rt1FrRDeepZtQLYj5ZNjTcTzSC7K7Fbt+nAHelJ3merZ7e37CWtXempIP9qBdTDbrtc3QIDAQAB";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
