package com.xialh.springbootconfig.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.Map;

/**
 * Created by  xiaolhe
 * CreateTime 2020-07-30  15:12
 *  此解析方法为： 解析配置里面的map集合中的key value（前提是,使用了el表达式去配置获取值）
 */
public class MapParst {
    public static Map<String, String> decodeMap(String value) {
        try {
            return JSONObject.parseObject(value, new TypeReference<Map<String, String>>(){});
        } catch (Exception e) {
            return null;
        }
    }
}
