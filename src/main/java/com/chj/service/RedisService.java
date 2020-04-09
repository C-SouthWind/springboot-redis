package com.chj.service;

import com.chj.config.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

/**
* @Description:
* @Author: chj
* @Date: 2020/3/24
*/
@Service
public class RedisService {

    @Autowired
    private RedisProperties redisProperties;

    @Autowired
    private JedisCluster jedisCluster;

   /** 方法描述 
   * @Description: 从redis中获取数据
   * @Param: [key]
   * @return: java.lang.String
   * @Author: chj
   * @Date: 2020/3/24
   */
    public String get(String key) {
        return jedisCluster.get(redisProperties.getPro()+key);
    }

    /** 方法描述 
    * @Description: 向redis中保存数据
    * @Param: [key, value]
    * @return: java.lang.String
    * @Author: chj
    * @Date: 2020/3/24
    */
    public String set(String key, String value) {
        return jedisCluster.set(redisProperties.getPro()+key, value);
    }

   /** 方法描述 
   * @Description: 删除redis中的数据
   * @Param: [key]
   * @return: java.lang.Long
   * @Author: chj
   * @Date: 2020/3/24
   */
    public Long del(String key) {
        return jedisCluster.del(redisProperties.getPro()+key);
    }

    /** 方法描述 
    * @Description: 设置redis缓存的失效时间    秒
    * @Param: [key, seconds]
    * @return: java.lang.Long
    * @Author: chj
    * @Date: 2020/3/24
    */
    public Long expire(String key, Integer seconds) {
        return jedisCluster.expire(redisProperties.getPro()+key, seconds);
    }
    /** 方法描述
    * @Description: 设置redis缓存的失效时间    毫秒
    * @Param: [key, milliseconds]
    * @return: java.lang.Long
    * @Author: chj
    * @Date: 2020/3/25
    */
    public Long pexpire(String key, long milliseconds){
        return jedisCluster.pexpire(redisProperties.getPro()+key, milliseconds);
    }

}
