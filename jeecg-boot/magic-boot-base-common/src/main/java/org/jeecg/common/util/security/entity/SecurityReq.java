package org.jeecg.common.util.security.entity;

import lombok.Data;

/**
 * @author liuyanhao
 * @date 2020-09-228
 */
@Data
public class SecurityReq {
    private String data;
    private String pubKey;
    private String signData;
    private String aesKey;
}
