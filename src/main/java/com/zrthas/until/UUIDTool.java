package com.zrthas.until;

import java.util.UUID;

/**
 * 生成32位ID
 * @author zrthas
 * @date 2018/10/10
 */
public class UUIDTool {
    /**
     * 生成32位ID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
