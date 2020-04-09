package com.chj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@Configuration
public class RedisConfig {

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisCluster getJedisCluster() throws IOException {
        Set<HostAndPort> hostAndPortSet = new HashSet<HostAndPort>();
        //获取集群ip
        String ipAddr = redisProperties.getIpAddr();
        //分割
        String[] ipPorts = ipAddr.split(",");
        //遍历
        for(String ipPort : ipPorts) {
            //分割ip和端口号
            String[] ipAndPorts = ipPort.split(":");
            //public JedisCluster(redis.clients.jedis.HostAndPort node) { /* compiled code */ }
            HostAndPort hostAndPort = new HostAndPort(ipAndPorts[0],Integer.parseInt(ipAndPorts[1]));
            hostAndPortSet.add(hostAndPort);
        }
        //JedisCluster类需要
        //public JedisCluster(redis.clients.jedis.HostAndPort node, int timeout, int maxAttempts) { /* compiled code */ }
        JedisCluster jedisCluster = new JedisCluster(hostAndPortSet, redisProperties.getCommandTimeout(), Integer.parseInt(redisProperties.getMaxAttempts()));
        return jedisCluster;
    }
}
