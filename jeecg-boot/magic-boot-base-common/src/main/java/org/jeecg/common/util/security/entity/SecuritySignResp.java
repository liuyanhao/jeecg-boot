package org.jeecg.common.util.security.entity;

import lombok.Data;

/**
 *
 * @author liuyanhao
 * @date  2020-09-28
 */
@Data
public class SecuritySignResp {
    private String data;
    private String signData;
    private String aesKey;
}
