package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.ValidateRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/wechat")
@RestController
public class WeChatApi {

    @GetMapping("/on-msg")
    public String onValidate(ValidateRequest request) {
        log.info("onValidate req:{}.", request);
        return request.getEchostr();
    }

    @PostMapping("/on-msg")
    public void onMsgReceived(String msg) {
        log.info("onMsgReceived msg:{}.", msg);
    }

}
