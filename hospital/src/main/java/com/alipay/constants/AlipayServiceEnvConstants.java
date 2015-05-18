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
    public static final String PRIVATE_KEY       = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAOW+KM7zWXfkCjvmT/HomMxXhYyuiPL8+PfBL/BibHEJczaGJCGRMpC92gdY047P1VRK2+sPc/ctYXvxyExfq4+ehsppuG1mzBma+TqSIe0VdC7Heam2n0gRNOVr720ga346q2cwmmwg8QwEilBlOBJDRByFN0dTkuu81D9kcpvVAgMBAAECgYAEiUKpA2kK0vfYwu1lK2CI+Flss62EjrYjvi7CIk9d0//wXams9/71mKoLZxeWREhEB85bz8xMXxsDpXx89Y6fl7/BJIwxeLnqGt/SLEJOm/+N3GoWSsRU+lpafo7VkkC54sGqcAmazcfL6QhqkFZD8lfF3Fz2VbNMJdJiMt92qQJBAPYeYpAOyTt4z8u6uzdzl6wVIswbh7o3N1S3aDZ1BdjyJ9LtfaUHXW/NlLQI3mF/SUJo5HiyofQDJcn6RDmKi2cCQQDu93ZuK9BNeYEMMTutrV7Y6ySFEmtpfRYj5JeJ46BvxhIOaJtCwym4JFGPv6VNjGnr8PDNDDk5QRCCYBwnztVjAkBa+4KOJJkpXhDbDG2XIyknmSyi7W5wXWcb7y0cLIh72ZD1PYwcDKvy37mgEEM9IZPQc/w5zjdmgB9hGh5MczXzAkBTSdjzST4O4ryBvV8ph3W5cSuHXgYl/D0NQY03uCihDI4ai4ch29fcoHv0+DzrLHd2jsG/FfWT6QOSDWGC1mo1AkEA6OM4mMP39UjeJxbPpnd17jjdOf8YYeej3NPX4arVluiqFyRxqj9hyRyGSF5q5qurMcAAne0888Am0DXFQxA7OA==";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDlvijO81l35Ao75k/x6JjMV4WMrojy/Pj3wS/wYmxxCXM2hiQhkTKQvdoHWNOOz9VUStvrD3P3LWF78chMX6uPnobKabhtZswZmvk6kiHtFXQux3mptp9IETTla+9tIGt+OqtnMJpsIPEMBIpQZTgSQ0QchTdHU5LrvNQ/ZHKb1QIDAQAB";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
