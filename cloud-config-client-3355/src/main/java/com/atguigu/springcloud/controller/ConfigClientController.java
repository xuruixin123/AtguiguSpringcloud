package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info") //对应 github 远程库上的文件名，要改一改
    private String configInfo;

    public String getConfigInfo(){
        return configInfo;
    }
}