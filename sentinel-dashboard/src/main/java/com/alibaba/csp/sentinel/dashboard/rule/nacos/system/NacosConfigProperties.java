package com.alibaba.csp.sentinel.dashboard.rule.nacos.system;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * nacos配置属性
 */
@Component
@ConfigurationProperties(prefix = "sentinel.dashboard.nacos")
public class NacosConfigProperties {

    /**
     * nacos地址
     */
    private String server;
    /**
     * nacos登录用户名
     */
    private String username;
    /**
     * nacos登录密码
     */
    private String password;
    /**
     * 命名空间
     */
    private String namespace;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
