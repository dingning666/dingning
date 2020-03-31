package com.redis.service;

import com.demo.entity.UserInfo;
import com.util.AppResponse;
import com.util.JsonUtils;
import com.util.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RedisService {

    @Autowired
    private RedisOperator redisOperator;


    /**
     * demo Redis练习
     * @param key
     * @param value
     * @param time
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    public AppResponse redisSet(String key,String value,int time) {
        /*if(0 != time){
            redisOperator.set(key,value,time);
        }else {
            redisOperator.set(key,value);
        }*/
        UserInfo user = new UserInfo();
        user.setUserName("dingning");
        user.setPhone("123123156413");
        String json = JsonUtils.toJson(user);
        redisOperator.set(key,json);
        return AppResponse.success("操作成功");
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    public AppResponse redisGet(String key) {
        String result = redisOperator.get(key);
        UserInfo userInfo = JsonUtils.fromJson(result,UserInfo.class);
        return AppResponse.success("操作成功",userInfo);
    }


    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    public AppResponse redisDel(String key) {
        List<String> list = Arrays.asList(key.split(","));
        redisOperator.del(list);
        return AppResponse.success("操作成功");
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    public AppResponse redisExpire(String key,int time) {
        redisOperator.expire(key,time);
        return AppResponse.success("操作成功");
    }

    /**
     * demo Redis练习
     * @param key
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-29
     */
    public AppResponse redisGetExpire(String key) {
        return AppResponse.success("操作成功",redisOperator.ttl(key));
    }
}
