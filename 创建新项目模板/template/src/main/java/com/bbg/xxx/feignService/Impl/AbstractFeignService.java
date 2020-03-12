package com.bbg.xxx.feignService.Impl;

import com.alibaba.fastjson.JSONObject;
import com.bbg.xxx.utils.StringUtils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工具父类
 */
public class AbstractFeignService {
    /**
     * json转换实体类
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    protected static <T extends Object> T json2Object(JSONObject json, Class<T> clazz){
        T result = null;
        if(null == json || json.isEmpty()){
            return result;
        }
        if(isValid(json)){
            //获取结果字段的json字符串
            String str = getResultJsonStr(json);
            if(StringUtils.isNotEmpty(str)){
                result = JSONObject.parseObject(str, clazz);
            }
        }
        return result;
    }

    /**
     * json转换集合List<T>
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    protected static <T extends Object> List<T> json2List(JSONObject json, Class<T> clazz){
        List<T> result = null;
        if(null == json || json.isEmpty()){
            return result;
        }
        if(isValid(json)){
            //获取结果字段的json字符串
            String str = getResultJsonStr(json);
            if(StringUtils.isNotEmpty(str)){
                result = JSONObject.parseArray(str, clazz);
            }
        }
        return result;
    }

    /**
     * bean转map
     * @param bean
     * @param <T>
     * @return
     */
    protected static <T> Map<String, Object> bean2Map(T bean) {
        Map<String, Object> map = Maps.newHashMap();
        if (bean != null) {
            BeanMap beanMap = BeanMap.create(bean);
            for (Object key : beanMap.keySet()) {
                map.put(key+"", beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * map转bean
     * @param map
     * @param bean
     * @param <T>
     * @return
     */
    protected static <T> T map2Bean(Map<String, Object> map,T bean) {
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    /**
     * List<T>转List<Map<String, Object>>
     * @param objList
     * @param <T>
     * @return
     */
    protected static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
        List<Map<String, Object>> list = Lists.newLinkedList();
        if (objList != null && objList.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0,size = objList.size(); i < size; i++) {
                bean = objList.get(i);
                map = bean2Map(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * List<Map<String, Object>>转List<T>
     * @param maps
     * @param clazz
     * @param <T>
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    protected static <T> List<T> mapsToObjects(List<Map<String, Object>> maps,Class<T> clazz) throws InstantiationException, IllegalAccessException {
        List<T> list = Lists.newArrayList();
        if (maps != null && maps.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0,size = maps.size(); i < size; i++) {
                map = maps.get(i);
                bean = clazz.newInstance();
                map2Bean(map, bean);
                list.add(bean);
            }
        }
        return list;
    }

    /**
     * 判断json返回结果是否有效
     * @param json
     * @return
     */
    private static boolean isValid(JSONObject json){
        if(StringUtils.isNotEmpty(String.valueOf(json.get("code"))) && ("0000".equals(String.valueOf(json.get("code")))
                || "0".equals(String.valueOf(json.get("code"))))){
            return true;
        }
        return false;
    }

    /**
     * 获取json的返回结果字符串
     * @param json
     * @return
     */
    private static String getResultJsonStr(JSONObject json){
        String str = "";
        if(json.containsKey("result")){
            str = JSONObject.toJSONString(json.get("result"));
        }else{
            str = JSONObject.toJSONString(json.get("object"));
        }
        return str;
    }

}
