package com.ffucks.repositories;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final RedisTemplate<String, Object> redisTemplate;

    public UserRepository(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void save(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    //TLL of 10 minutes
    /*public void save(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, Duration.ofMinutes(10));
    }*/

    public Object findById(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
