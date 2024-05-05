package com.tencent.wxcloudrun.model;

import lombok.Data;

@Data
public class ValidateRequest {

    private String signature;

    private String timestamp;

    private String nonce;

    private String echostr;

}
