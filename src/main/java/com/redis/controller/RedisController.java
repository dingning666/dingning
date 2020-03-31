package com.redis.controller;

import com.redis.service.RedisService;
import com.util.AppResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Redis
 * @author dingning
 * @time 2020-03-24
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisService redisService;

    /**
     * demo Redis练习
     * @param key
     * @param value
     * @param time
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    @PostMapping("/redisSet")
    public AppResponse redisSet(String key,String value,int time) {
        try {
            return redisService.redisSet(key,value,time);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    @PostMapping("/redisGet")
    public AppResponse redisGet(String key) {
        try {
            return redisService.redisGet(key);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    @PostMapping("/redisDel")
    public AppResponse redisDel(String key) {
        try {
            return redisService.redisDel(key);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    @PostMapping("/redisExpire")
    public AppResponse redisExpire(String key,int time) {
        try {
            return redisService.redisExpire(key,time);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    @PostMapping("/redisGetExpire")
    public AppResponse redisGetExpire(String key) {
        try {
            return redisService.redisGetExpire(key);
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        }
    }
}
