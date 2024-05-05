package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/wechat")
@RestController
public class WeChatApi {

    @PostMapping("on-msg")
    public void onMsgReceived(String msg) {
        log.info("onMsgReceived msg:{}.", msg);
    }

}
