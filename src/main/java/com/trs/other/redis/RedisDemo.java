package com.trs.other.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/16 13:41
 */
public class RedisDemo {
    public void addHashMap(String key, HashMap map) {
        Jedis redis = new Jedis("127.0.0.1", 6379);//连接redis
        redis.hmset(key, map);
        System.out.println("hashmap set success!");
    }

    public HashSet queryHashMapByKey(String key) {
        Jedis redis = new Jedis("127.0.0.1", 6379);//连接redis
        return (HashSet) redis.hkeys(key);
        //return (HashSet) redis.hvals(key);
    }

    public String queryString(String key) {
        Jedis redis = new Jedis("127.0.0.1", 6379);//连接redis
        return redis.get(key);
    }

    public void addString(String key, String value) {
        Jedis redis = new Jedis("127.0.0.1", 6379);//连接redis
        boolean flag = redis.exists(key);
        System.out.println(flag);
        redis.set(key, value);
        System.out.println("set " + key + " : " + value + ",success");
    }

    public static void main(String[] args) {
        RedisDemo t1 = new RedisDemo();
        //String
        t1.addString("id", "120120");

        String value = t1.queryString("id");
        System.out.println("get id >>>" + value);

        //HashMap
        HashMap map = new HashMap();
        map.put("MapId1", "MapValue1");
        map.put("MapId2", "MapValue2");
        map.put("MapId3", "MapValue3");
        t1.addHashMap("hashmap", map);

        HashSet list = t1.queryHashMapByKey("hashmap");
        System.out.println(String.format("keys: %s", list));
    }

}
