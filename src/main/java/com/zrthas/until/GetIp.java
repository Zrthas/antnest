package com.zrthas.until;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: antnest
 * @description: 获取请求的IP地址
 * @author: zrthas
 * @create: 2018-10-18
 **/
public class GetIp {
    public static String getUserIp(HttpServletRequest request) throws Exception {
        String ip = request.getHeader("X-Real-IP");
        if (null!= ip && !"unknown".equals(ip)&&"".equals(ip)) {
            return ip;
        }
        ip = request.getHeader("X-Forwarded-For");
        if (null!= ip && !"unknown".equals(ip)&&"".equals(ip)) {
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        } else {
            return request.getRemoteAddr();
        }
    }
}
