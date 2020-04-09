package com.chj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: chj
 * @Date: 2020/3/24
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {
    /**
    * ip和端口号
    */
    private String ipAddr;
    /**
     * 最大连接
     */
    private String maxAttempts;
    /**
     * 连接超时时间
     */
    private Integer commandTimeout;
    /**
     * 工程名
     */
    private String  pro;

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(String maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public Integer getCommandTimeout() {
        return commandTimeout;
    }

    public void setCommandTimeout(Integer commandTimeout) {
        this.commandTimeout = commandTimeout;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}
