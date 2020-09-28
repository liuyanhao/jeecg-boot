package org.jeecg.common.util.encryption;


import lombok.Data;

/**
 * 加密字符串
 * @author liuyanhao
 * @date  2020-09-28
 */
@Data
public class  EncryptedString {

    public static  String key = "1234567890adbcde";//长度为16个字符

    public static  String iv  = "1234567890hjlkew";//长度为16个字符
}
