package org.jeecg.modules.base.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.dto.LogDTO;
import org.jeecg.modules.base.mapper.BaseCommonMapper;
import org.jeecg.modules.base.service.BaseCommonService;
import org.jeecg.common.system.vo.LoginUser;
import org.jeecg.common.util.IPUtils;
import org.jeecg.common.util.SpringContextUtils;
import org.jeecg.common.util.oConvertUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class BaseCommonServiceImpl implements BaseCommonService {

    @Resource
    private BaseCommonMapper baseCommonMapper;

    @Override
    public void addLog(LogDTO logDTO) {
        if(oConvertUtils.isEmpty(logDTO.getId())){
            logDTO.setId(String.valueOf(IdWorker.getId()));
        }
        baseCommonMapper.saveLog(logDTO);
    }

    @Override
    public void addLog(String logContent, Integer logType, Integer operatetype, LoginUser user) {
        LogDTO sysLog = new LogDTO();
        sysLog.setId(String.valueOf(IdWorker.getId()));
        //注解上的描述,操作日志内容
        sysLog.setLogContent(logContent);
        sysLog.setLogType(logType);
        sysLog.setOperateType(operatetype);
        try {
            //获取request
            HttpServletRequest request = SpringContextUtils.getHttpServletRequest();
            //设置IP地址
            sysLog.setIp(IPUtils.getIpAddr(request));
        } catch (Exception e) {
            sysLog.setIp("127.0.0.1");
        }
        //获取登录用户信息
        if(user==null){
            try {
                user = (LoginUser) SecurityUtils.getSubject().getPrincipal();
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
        if(user!=null){
            sysLog.setUserid(user.getUsername());
            sysLog.setUsername(user.getRealname());
        }
        sysLog.setCreateTime(new Date());
        //保存系统日志
        baseCommonMapper.saveLog(sysLog);
    }

    @Override
    public void addLog(String logContent, Integer logType, Integer operateType) {
        addLog(logContent, logType, operateType, null);
    }



}
