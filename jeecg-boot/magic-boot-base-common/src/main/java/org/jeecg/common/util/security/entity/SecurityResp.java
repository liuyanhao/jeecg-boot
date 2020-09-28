package org.jeecg.common.util.security.entity;

import cn.hutool.json.JSONObject;
import lombok.Data;

/**
 * 安全响应
 * @author liuyanhao
 * @date 2020-09-28
 */
@Data
public class SecurityResp {
    private Boolean success;
    private JSONObject data;
}
