package com.carpedium.common.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Redis {

    private StringRedisTemplate template;

    /**
     * expire 为过期时间
     *
     * @param key
     * @param value
     * @param expire
     */
    public void set(String key, String value, long expire){
        template.opsForValue().set(key, value, expire, TimeUnit.SECONDS);
    }

    public void set(String key, String value){
        template.opsForValue().set(key, value);
    }

    public Object get(String key){
        return template.opsForValue().get(key);
    }

    public void delete(String key){
        template.delete(key);
    }

}
