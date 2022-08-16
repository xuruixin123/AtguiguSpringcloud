package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}") //此处我们没有用 github，所以可能要修改
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo(){
        return "serverPort:"+serverPort+"\t\n\n configInfo:"+configInfo;
    }

}
